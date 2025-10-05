package modelo_negocio;

import java.util.LinkedList;
import java.util.List;

public class ListaInscripciones {
    private List<Inscripcion> inscripciones;
    
    private static ListaInscripciones instance;

    private ListaInscripciones(){
        inscripciones = new LinkedList<>();
    }

    public static ListaInscripciones getInstance() {
        if(instance == null) {
            instance = new ListaInscripciones();
        }
        return instance;
    }

    public void agregarInscripcion(Inscripcion inscripcion){
        inscripciones.add(inscripcion);
    }

    public List<Inscripcion> getInscripciones(){
        return inscripciones;
    }
}
