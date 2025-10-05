package modelo;

/**
 * IModeloControl.java
 * 
 * Interfaz con la que se comunica el control para modificar o solicitar elementos del modelo.
 * 
 * @author Pedro Luna Esquer
 */
public interface IModeloControl {
    public void seleccionarTaller(String nombreTaller);

    public void inscribir(String nombreTaller, String id);

    public void confirmarInscripcion();

    /**
     * Método que valida un id de un estudiante
     * @param id ID a validar
     */
    public void validarID(String id);
}
