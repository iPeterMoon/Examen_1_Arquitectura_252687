package modelo_negocio;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;

public interface IModeloNegocio {

    public void seleccionarTaller(String nombre);

    public void inscribir(String idAlumno) throws InscripcionNoValidaException;

    public void validarID(String idAlumno) throws AlumnoNoEncontradoException;

    public void empezarCasoUso();

}
