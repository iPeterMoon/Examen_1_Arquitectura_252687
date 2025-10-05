package modelo_negocio;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;
import mappers.AlumnoMapper;
import mappers.InscripcionMapper;
import mappers.TallerMapper;
import modelo.IModeloVista;
import modelo.ModeloVistaFacade;

public class ModeloNegocioImp implements IModeloNegocio {

    private static ModeloNegocioImp instance;

    private ModeloNegocioImp() {

    }

    public static ModeloNegocioImp getInstance() {
        if (instance == null) {
            instance = new ModeloNegocioImp();
        }
        return instance;
    }

    private Taller tallerSeleccionado;

    @Override
    public void seleccionarTaller(String nombre) {
        ListaTalleres listaTalleres = ListaTalleres.getInstance();
        for (Taller taller : listaTalleres.getTalleres()) {
            if (taller.getNombre().equals(nombre)) {
                this.tallerSeleccionado = taller;
                IModeloVista modeloVista = new ModeloVistaFacade();
                modeloVista.mostrarDetallesTaller(TallerMapper.toVista(tallerSeleccionado));
            }
        }
    }

    @Override
    public void inscribir(String idAlumno) throws InscripcionNoValidaException {
        ListaAlumnos listaAlumnos = ListaAlumnos.getInstance();
        for (Alumno alumno : listaAlumnos.getAlumnos()) {
            if (alumno.getId().equals(idAlumno)) {
                Alumno alumnoAInscribir = alumno;
                validarInscripcion(alumnoAInscribir);
                validarCupoTaller();
                Inscripcion inscripcion = registrarInscripcion(alumnoAInscribir);
                IModeloVista modeloVista = new ModeloVistaFacade();
                modeloVista.mostrarTicket(InscripcionMapper.toTicket(inscripcion));               
                restarCupoTaller();
            }
        }

    }

    private void validarInscripcion(Alumno alumnoAInscribir) throws InscripcionNoValidaException {
        ListaInscripciones listaInscripciones = ListaInscripciones.getInstance();
        for (Inscripcion inscripcion : listaInscripciones.getInscripciones()) {
            Taller taller = inscripcion.getTaller();
            Alumno alumno = inscripcion.getAlumno();
            if (taller.getNombre().equals(tallerSeleccionado.getNombre()) && alumno.getId().equals(alumnoAInscribir.getId())) {
                throw new InscripcionNoValidaException("Usted ya está inscrito a este taller");
            }
        }
    }

    private void validarCupoTaller() throws InscripcionNoValidaException{
        ListaTalleres talleres = ListaTalleres.getInstance();
        for (Taller taller : talleres.getTalleres()) {
            if (taller.getNombre().equals(tallerSeleccionado.getNombre())) {
                if (taller.getCupo() <= 0) {
                    throw new InscripcionNoValidaException("El taller al que intenta inscribirse ya está lleno");
                }
            }
        }
    }
    
    private Inscripcion registrarInscripcion(Alumno alumnoAInscribir){
        Inscripcion inscripcion = new Inscripcion(alumnoAInscribir, tallerSeleccionado, generarFolio(),
        generarFechaRegistro());
        ListaInscripciones listaInscripciones = ListaInscripciones.getInstance();
        listaInscripciones.agregarInscripcion(inscripcion);
        return inscripcion;
    }
    private String generarFolio() {
        LocalTime ahora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        return "ISW" + ahora.format(formatter);
    }
    
    private String generarFechaRegistro() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy, h:mm a");
        String fechaFormateada = ahora.format(formatter).replace("AM", "a.m.").replace("PM", "p.m.");
        return "Registrado el " + fechaFormateada;
    }
    
    private void restarCupoTaller() {
        ListaTalleres talleres = ListaTalleres.getInstance();
        for (Taller taller : talleres.getTalleres()) {
            if (taller.getNombre().equals(tallerSeleccionado.getNombre())) {
                taller.setCupo(taller.getCupo()-1);
            }
        }
    }
    @Override
    public void validarID(String idAlumno) throws AlumnoNoEncontradoException{
        ListaAlumnos listaAlumnos = ListaAlumnos.getInstance();
        Alumno alumnoEncontrado = null;
        for (Alumno alumno : listaAlumnos.getAlumnos()) {
            if (alumno.getId().equals(idAlumno)) {
                alumnoEncontrado = alumno;
            }
        }
        if(alumnoEncontrado == null){
            throw new AlumnoNoEncontradoException("No se encontró un alumno con el ID especificado");
        }
        IModeloVista modeloVista = new ModeloVistaFacade();
        modeloVista.mostrarAlumno(AlumnoMapper.toVista(alumnoEncontrado));
    }

    /**
     * Carga los talleres hacia el modelo de la vista
     */
    private void cargarTalleres() {
        ListaTalleres listaTalleres = ListaTalleres.getInstance();
        List<Taller> talleres = listaTalleres.getTalleres();
        IModeloVista modeloVista = new ModeloVistaFacade();
        for (Taller taller : talleres) {
            modeloVista.agregarTaller(TallerMapper.toVista(taller));
        }
    }

    @Override
    public void empezarCasoUso() {
        IModeloVista modeloVista = new ModeloVistaFacade();
        cargarTalleres();
        modeloVista.mostrarPantalla();
    }

}
