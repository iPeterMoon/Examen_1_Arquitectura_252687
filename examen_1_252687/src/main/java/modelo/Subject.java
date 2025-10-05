package modelo;

import java.util.LinkedList;
import java.util.List;

import vista.IObserver;

/**
 * Subject.java
 * 
 *  Clase que representa un sujeto observado (Patron Observer)
 *
 * @author Pedro Luna Esquer
 */
public abstract class Subject {
    
    /**
     * Lista de observadores registrados en este subject
     */
    private List<IObserver> observers;

    /**
     * Constructor que inicializa la lista de observers
     */
    public Subject(){
        this.observers = new LinkedList<>();
    }

    /**
     * Método para agregar un observer a la lista de observers registrados del subject
     * @param observer Observer a registrar
     */
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    /**
     * Método para notificar a todos los observers registrados en el subject
     */
    public void notifyAllObservers() {
        for(IObserver observer : observers){
            observer.update(this);
        }
    }

}
