package modelo;

import java.util.LinkedList;
import java.util.List;

/**
 * ListaTalleresSubject.java
 * 
 * Clase que almacena la lista de talleres en el modelo de parte del mvc para
 * mostrarlos en la vista.
 * 
 * @author Pedro Luna Esquer
 */
public class ListaTalleresSubject extends Subject {
    /**
     * Lista de talleres guardados en la base de datos
     */
    private final List<TallerSubject> talleres;

    private static ListaTalleresSubject instance;

    /**
     * Constructor que inicializa la lista de talleres.
     */
    private ListaTalleresSubject() {
        super();
        this.talleres = new LinkedList<>();
    }

    /**
     * Obtiene la única instancia de ListaTalleresSubject (Singleton).
     * 
     * @return La instancia única de ListaTalleresSubject.
     */
    public static ListaTalleresSubject getInstance() {
        if (instance == null) {
            instance = new ListaTalleresSubject();
        }
        return instance;
    }

    /**
     * Metodo para agregar un taller a la lista de talleres
     * 
     * @param taller Taller a agregar a la lista
     */
    public void agregarTaller(TallerSubject taller) {
        this.talleres.add(taller);
        notifyAllObservers();
    }

    /**
     * Regresa la lista completa de talleres.
     * 
     * @return La lista de TallerSubject.
     */
    public List<TallerSubject> getListaTalleres() {
        return talleres;
    }

}
