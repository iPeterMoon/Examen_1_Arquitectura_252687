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
    private final List<TallerVista> talleres;

    private static ListaTalleresSubject instance;

    /**
     * Constructor que inicializa la lista de talleres.
     */
    private ListaTalleresSubject() {
        super();
        this.talleres = new LinkedList<>();
    }

    public static ListaTalleresSubject getInstance(){
        if(instance == null){
            instance = new ListaTalleresSubject();
        }
        return instance;
    }

    /**
     * Metodo para agregar un taller a la lista de talleres
     * @param taller Taller a agregar a la lista
     */
    public void agregarTaller(TallerVista taller){
        this.talleres.add(taller);
        notifyAllObservers();
    }
    
    /**
     * Metodo para actualizar un taller de la lista de talleres
     * reemplaza todos los valores del taller que estaban en la lista
     * @param tallerActualizado Taller con nuevos datos
     */
    public void actualizarTaller(TallerVista tallerActualizado) {
        for(TallerVista taller : talleres) {
            if(taller.getNombre().equals(tallerActualizado.getNombre())){
                taller.setNombre(tallerActualizado.getNombre());
                taller.setInstructor(tallerActualizado.getInstructor());
                taller.setFechaYHora(tallerActualizado.getFechaYHora());
                taller.setCupo(tallerActualizado.getCupo());
            }
        }
    }

    public List<TallerVista> getListaTalleres(){
        return talleres;
    }
    
}
