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

/**
 * ModeloNegocioImp.java
 * 
 * Implementación principal de la interfaz IModeloNegocio. Contiene la lógica
 * central del caso de uso, incluyendo validaciones de ID, cupo, registro de
 * inscripciones y gestión de repositorios.
 * Implementa el patrón Singleton.
 * 
 * @author Pedro Luna Esquer
 */
public class ModeloNegocioImp implements IModeloNegocio {

    private static ModeloNegocioImp instance;

    /**
     * Constructor privado para forzar el patrón Singleton.
     */
    private ModeloNegocioImp() {

    }

    /**
     * Accesor Singleton para obtener la única instancia del servicio.
     * 
     * @return La instancia única de ModeloNegocioImp.
     */
    public static ModeloNegocioImp getInstance() {
        if (instance == null) {
            instance = new ModeloNegocioImp();
        }
        return instance;
    }

    private Taller tallerSeleccionado;

    /**
     * @see modelo_negocio.IModeloNegocio#seleccionarTaller(java.lang.String)
     */
    @Override
    public void seleccionarTaller(String nombre) {
        ListaTalleres listaTalleres = ListaTalleres.getInstance();
        for (Taller taller : listaTalleres.getTalleres()) {
            if (taller.getNombre().equals(nombre)) {
                this.tallerSeleccionado = taller;
                IModeloVista modeloVista = new ModeloVistaFacade();
                // Utiliza un Mapper para convertir la entidad de negocio a un Subject de la vista
                modeloVista.mostrarDetallesTaller(TallerMapper.toVista(tallerSeleccionado));
            }
        }
    }

    /**
     * @see modelo_negocio.IModeloNegocio#inscribir(java.lang.String)
     */
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
                // Utiliza un Mapper para notificar a la Vista con el Ticket/Inscripcion
                modeloVista.mostrarTicket(InscripcionMapper.toTicket(inscripcion));
                restarCupoTaller();
                return; // Inscripción exitosa
            }
        }
        // Si el ciclo termina sin encontrar al alumno (aunque ya se validó antes, es
        // una doble verificación)
        throw new InscripcionNoValidaException("Error interno: Alumno no encontrado para inscripción.");

    }

    /**
     * Verifica si el alumno ya tiene un registro de inscripción para el taller
     * seleccionado.
     * 
     * @param alumnoAInscribir El alumno que intenta inscribirse.
     * @throws InscripcionNoValidaException Si el alumno ya está inscrito.
     */
    private void validarInscripcion(Alumno alumnoAInscribir) throws InscripcionNoValidaException {
        ListaInscripciones listaInscripciones = ListaInscripciones.getInstance();
        for (Inscripcion inscripcion : listaInscripciones.getInscripciones()) {
            Taller taller = inscripcion.getTaller();
            Alumno alumno = inscripcion.getAlumno();
            if (taller.getNombre().equals(tallerSeleccionado.getNombre())
                    && alumno.getId().equals(alumnoAInscribir.getId())) {
                throw new InscripcionNoValidaException("Usted ya está inscrito a este taller");
            }
        }
    }

    /**
     * Verifica que el taller seleccionado aún tenga cupo disponible.
     * 
     * @throws InscripcionNoValidaException Si el cupo es menor o igual a cero.
     */
    private void validarCupoTaller() throws InscripcionNoValidaException {
        ListaTalleres talleres = ListaTalleres.getInstance();
        for (Taller taller : talleres.getTalleres()) {
            if (taller.getNombre().equals(tallerSeleccionado.getNombre())) {
                if (taller.getCupo() <= 0) {
                    throw new InscripcionNoValidaException("El taller al que intenta inscribirse ya está lleno");
                }
            }
        }
    }

    /**
     * Crea la entidad Inscripcion, genera el folio y la fecha, y la guarda en el
     * repositorio.
     * 
     * @param alumnoAInscribir El alumno para el registro.
     * @return La nueva entidad Inscripcion creada.
     */
    private Inscripcion registrarInscripcion(Alumno alumnoAInscribir) {
        Inscripcion inscripcion = new Inscripcion(alumnoAInscribir, tallerSeleccionado, generarFolio(),
                generarFechaRegistro());
        ListaInscripciones listaInscripciones = ListaInscripciones.getInstance();
        listaInscripciones.agregarInscripcion(inscripcion);
        return inscripcion;
    }

    /**
     * Genera un folio único basado en la hora actual.
     * 
     * @return El folio de inscripción.
     */
    private String generarFolio() {
        LocalTime ahora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        return "ISW" + ahora.format(formatter);
    }

    /**
     * Genera la cadena de texto con la fecha y hora de registro en formato legible.
     * 
     * @return La fecha de registro formateada.
     */
    private String generarFechaRegistro() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy, h:mm a");
        String fechaFormateada = ahora.format(formatter).replace("AM", "a.m.").replace("PM", "p.m.");
        return "Registrado el " + fechaFormateada;
    }

    /**
     * Resta uno al cupo del taller seleccionado después de una inscripción exitosa.
     */
    private void restarCupoTaller() {
        ListaTalleres talleres = ListaTalleres.getInstance();
        for (Taller taller : talleres.getTalleres()) {
            if (taller.getNombre().equals(tallerSeleccionado.getNombre())) {
                taller.setCupo(taller.getCupo() - 1);
            }
        }
    }

    /**
     * @see modelo_negocio.IModeloNegocio#validarID(java.lang.String)
     */
    @Override
    public void validarID(String idAlumno) throws AlumnoNoEncontradoException {
        ListaAlumnos listaAlumnos = ListaAlumnos.getInstance();
        Alumno alumnoEncontrado = null;
        for (Alumno alumno : listaAlumnos.getAlumnos()) {
            if (alumno.getId().equals(idAlumno)) {
                alumnoEncontrado = alumno;
            }
        }
        if (alumnoEncontrado == null) {
            throw new AlumnoNoEncontradoException("No se encontró un alumno con el ID especificado");
        }
        IModeloVista modeloVista = new ModeloVistaFacade();
        // Muestra los datos del alumno encontrado en la Vista
        modeloVista.mostrarAlumno(AlumnoMapper.toVista(alumnoEncontrado));
    }

    /**
     * Carga los talleres iniciales del repositorio hacia el modelo de la vista
     * (Subjects).
     */
    private void cargarTalleres() {
        ListaTalleres listaTalleres = ListaTalleres.getInstance();
        List<Taller> talleres = listaTalleres.getTalleres();
        IModeloVista modeloVista = new ModeloVistaFacade();
        for (Taller taller : talleres) {
            // Utiliza el Façade para agregarlos a la Vista (y disparar la notificación)
            modeloVista.agregarTaller(TallerMapper.toVista(taller));
        }
    }

    /**
     * @see modelo_negocio.IModeloNegocio#empezarCasoUso()
     */
    @Override
    public void empezarCasoUso() {
        IModeloVista modeloVista = new ModeloVistaFacade();
        cargarTalleres();
        modeloVista.mostrarPantalla();
    }

}
