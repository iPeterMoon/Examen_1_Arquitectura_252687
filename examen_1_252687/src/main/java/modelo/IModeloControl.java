package modelo;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;

/**
 * IModeloControl.java
 * 
 * Interfaz con la que se comunica el control para modificar o solicitar elementos del modelo.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public interface IModeloControl {
    
    /**
     * Selecciona un taller por su nombre y lo establece como el taller activo para la inscripción.
     * @param nombreTaller Nombre del taller seleccionado por el usuario.
     */
    public void seleccionarTaller(String nombreTaller);

    /* 
     * 
     * Procesa la inscripción del alumno en el taller previamente seleccionado.
     * @param id ID del alumno que intenta inscribirse.
     * @throws InscripcionNoValidaException Si el taller está lleno o ya está inscrito.
     */
    public void inscribir(String id) throws InscripcionNoValidaException;

    /**
     * Método que valida un id de un estudiante en el Modelo de Negocio.
     * Si el ID es válido, los datos del alumno se cargan y notifican a la Vista.
     * @param id ID a validar.
     * @throws AlumnoNoEncontradoException Si el ID no corresponde a ningún alumno registrado.
     */
    public void validarID(String id) throws AlumnoNoEncontradoException;
}
