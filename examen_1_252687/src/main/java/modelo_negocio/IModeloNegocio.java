package modelo_negocio;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;

/**
 * IModeloNegocio.java
 * 
 * Interfaz que define las operaciones de la lógica de negocio que deben ser
 * implementadas.
 * Esta interfaz es la que usa la capa de Control para ejecutar el caso de uso.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public interface IModeloNegocio {

    /**
     * Establece el taller seleccionado por el usuario y notifica a la Vista de los
     * detalles.
     * 
     * @param nombre Nombre del taller seleccionado.
     */
    public void seleccionarTaller(String nombre);

    /**
     * Ejecuta la lógica completa de inscripción: valida cupo, verifica doble
     * inscripción,
     * registra el ticket y resta el cupo.
     * 
     * @param idAlumno ID del alumno a inscribir.
     * @throws InscripcionNoValidaException Si no hay cupo o el alumno ya está
     *                                      inscrito.
     */
    public void inscribir(String idAlumno) throws InscripcionNoValidaException;

    /**
     * Busca y valida la existencia de un alumno por su ID en el repositorio.
     * Si lo encuentra, notifica a la Vista con los datos del alumno.
     * 
     * @param idAlumno ID del alumno a buscar.
     * @throws AlumnoNoEncontradoException Si el ID no se encuentra.
     */
    public void validarID(String idAlumno) throws AlumnoNoEncontradoException;

    /**
     * Inicia el caso de uso cargando los talleres y mostrando la pantalla inicial.
     */
    public void empezarCasoUso();

}