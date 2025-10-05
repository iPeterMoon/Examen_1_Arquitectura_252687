package vista;

import modelo.Subject;

/**
 * ModelObserver.java
 * 
 * Clase que representa el Observer del Modelo del mvc, en cuanto algo cambia esta clase 
 * se encarga de decirle a la vista que se actualice.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class ModelObserver implements IObserver {

    /**
     * Se encarga de actualizar la pantalla principal en cuanto recibe un update de un subject
     */
    @Override
    public void update(Subject subject) {
        PantallaInscripcion pantalla = PantallaInscripcion.getInstance();
        pantalla.actualizarVista(subject);
    }
    
}
