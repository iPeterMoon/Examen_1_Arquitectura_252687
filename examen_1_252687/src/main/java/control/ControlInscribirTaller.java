package control;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;
import modelo.IModeloControl;
import modelo.ModeloControlImp;

/**
 * ControlInscribirTaller.java
 * 
 * Clase que representa el control del patrón MVC, se encarga de recibir los
 * inputs del usuario
 * en la vista y pasarlos al modelo del mvc.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class ControlInscribirTaller {

    /**
     * Método para seleccionar un taller de la lista de talleres
     * 
     * @param nombre Nombre del taller seleccionado (debería ser único)
     */
    public void seleccionarTaller(String nombre) {
        IModeloControl modelo = new ModeloControlImp();
        modelo.seleccionarTaller(nombre);
    }

    /**
     * Metodo para validar el ID ingresado de un alumno, llama al método del modelo (mvc)
     * @param idAlumno ID del alumno a buscar/validar
     * @throws AlumnoNoEncontradoException Si no encuentra al alumno en la base de datos
     */
    public void validarID(String idAlumno) throws AlumnoNoEncontradoException {
        IModeloControl modelo = new ModeloControlImp();
        modelo.validarID(idAlumno);
    }

    /**
     * Método para inscribir al alumno en el taller, llama al método del modelo.
     * 
     * @param idAlumno Id del alumno a inscribir en el taller (el taller ya está guardado)
     * @throws InscripcionNoValidaException Si el alumno ya está inscrito o no hay cupos.
     */
    public void inscribir(String idAlumno) throws InscripcionNoValidaException {
        IModeloControl modelo = new ModeloControlImp();
        modelo.inscribir(idAlumno);
    }
}
