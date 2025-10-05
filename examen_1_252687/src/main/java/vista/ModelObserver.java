package vista;

import modelo.Subject;

/**
 * ModelObserver.java
 * 
 * Clase que representa el Observer del Modelo del mvc, en cuanto algo cambia esta clase 
 * se encarga de decirle a la vista que se actualice.
 */
public class ModelObserver implements IObserver {

    @Override
    public void update(Subject subject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
