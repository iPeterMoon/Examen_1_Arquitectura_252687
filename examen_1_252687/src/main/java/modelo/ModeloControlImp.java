package modelo;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;
import modelo_negocio.IModeloNegocio;
import modelo_negocio.ModeloNegocioImp;

/**
 * ModeloControlImp.java
 * 
 * Implementación de la interfaz IModeloControl. Sirve como un adaptador 
 * para redirigir las peticiones del Controlador hacia la capa de Modelo-Negocio.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class ModeloControlImp implements IModeloControl {

    /**
     * Llama al Modelo de Negocio para seleccionar y activar un taller.
     * @param nombreTaller Nombre del taller a seleccionar.
     */
    @Override
    public void seleccionarTaller(String nombreTaller) {
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.seleccionarTaller(nombreTaller);
    }
    
    /**
     * Llama al Modelo de Negocio para realizar el proceso de inscripción.
     * @param idAlumno ID del alumno que se va a inscribir.
     * @throws InscripcionNoValidaException Si la inscripción no puede completarse (ej. cupo lleno).
     */
    @Override
    public void inscribir(String idAlumno) throws InscripcionNoValidaException{
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.inscribir(idAlumno);
    }
    
    /**
     * Llama al Modelo de Negocio para validar la existencia del ID del alumno.
     * @param id ID del alumno a validar.
     * @throws AlumnoNoEncontradoException Si el alumno no existe.
     */
    @Override
    public void validarID(String id) throws AlumnoNoEncontradoException{
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.validarID(id);
    }
    
}
