package modelo;

import java.util.LinkedList;
import java.util.List;

/**
 * ListaTalleresSubject.java
 * 
 * Clase que almacena la lista de talleres en el modelo de parte del mvc para mostrarlos en la vista.
 * 
 * @author Pedro Luna Esquer
 */
public class ListaTalleresSubject extends Subject {
    /**
     * Lista de talleres guardados en la base de datos
     */
    private final List<Taller> talleres;

    /**
     * Constructor que inicializa la lista de talleres.
     */
    public ListaTalleresSubject() {
        this.talleres = new LinkedList<>();
    }

    /**
     * Metodo para agregar un taller a la lista de talleres
     * @param taller Taller a agregar a la lista
     */
    public void agregarTaller(Taller taller){
        this.talleres.add(taller);
    }
    
    /**
     * Metodo para actualizar un taller de la lista de talleres
     * reemplaza todos los valores del taller que estaban en la lista
     * @param tallerActualizado Taller con nuevos datos
     */
    public void actualizarTaller(Taller tallerActualizado) {
        for(Taller taller : talleres) {
            if(taller.getNombre().equals(tallerActualizado.getNombre())){
                taller.setNombre(tallerActualizado.getNombre());
                taller.setInstructor(tallerActualizado.getInstructor());
                taller.setFechaYHora(tallerActualizado.getFechaYHora());
                taller.setCupo(tallerActualizado.getCupo());
            }
        }
    }
    
}
