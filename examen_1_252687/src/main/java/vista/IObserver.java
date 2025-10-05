package vista;

import modelo.Subject;

/**
 * IObserver.java
 * 
 * Interfaz que representa a un observador del patrón Observer.
 * 
 * @author Pedro Luna Esquer
 */
public interface IObserver {
    
    /**
     * Metodo para actualizar, recibe el subject que fue actualizado.
     * @param subject Subject que fue actualizado
     */
    public void update(Subject subject);

}
