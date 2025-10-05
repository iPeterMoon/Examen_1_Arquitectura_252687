package modelo_negocio;

public interface IModeloNegocio {

    public void seleccionarTaller(String nombre);

    public void confirmarInscripcion(String nombreTaller, String idAlumno);

    public void validarID(String idAlumno);

}
