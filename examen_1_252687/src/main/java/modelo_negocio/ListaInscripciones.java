package modelo_negocio;

import java.util.LinkedList;
import java.util.List;

/**
 * ListaInscripciones.java
 * 
 * Repositorio de datos para los objetos Inscripcion (simula la base de datos de registros).
 * Implementa el patrón Singleton.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class ListaInscripciones {
    private List<Inscripcion> inscripciones;
    
    private static ListaInscripciones instance;

    /**
     * Constructor privado que inicializa la lista de inscripciones.
     */
    private ListaInscripciones(){
        inscripciones = new LinkedList<>();
    }

    /**
     * Accesor Singleton para obtener la única instancia del repositorio.
     * @return La instancia única de ListaInscripciones.
     */
    public static ListaInscripciones getInstance() {
        if(instance == null) {
            instance = new ListaInscripciones();
        }
        return instance;
    }

    /**
     * Agrega un nuevo registro de inscripción al repositorio.
     * @param inscripcion El objeto Inscripcion a agregar.
     */
    public void agregarInscripcion(Inscripcion inscripcion){
        inscripciones.add(inscripcion);
    }

    /**
     * Regresa la lista completa de inscripciones.
     * @return Lista de objetos Inscripcion.
     */
    public List<Inscripcion> getInscripciones(){
        return inscripciones;
    }
}