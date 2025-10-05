package modelo_negocio;

import java.util.LinkedList;
import java.util.List;

/**
 * ListaTalleres.java
 * 
 * Repositorio de datos para los objetos Taller (simula la base de datos).
 * Implementa el patrón Singleton.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class ListaTalleres {
    private List<Taller> talleres;

    private static ListaTalleres instance;

    /**
     * Constructor privado que inicializa el repositorio con datos de prueba (mock).
     */
    private ListaTalleres() {
        talleres = new LinkedList<>();

        // Datos mock para pruebas
        talleres.add(new Taller("Fotografía Digital", "Carlos Ruiz", "2025-10-10 16:00 - 17:00 p.m.", 20));
        talleres.add(new Taller("Diseño 3D", "Laura Gómez", "2025-10-12 10:00 - 12:00 p.m.", 15));
        talleres.add(new Taller("Programación Web", "Pedro Luna", "2025-10-15 14:00 - 16:30 p.m.", 25));
        talleres.add(new Taller("Robótica Básica", "Ana García", "2025-10-18 09:00 - 11:00 a.m.", 18));
        talleres.add(new Taller("Pintura Creativa", "Sofía Torres", "2025-10-20 11:00 - 12:00 p.m.", 12));
    }

    /**
     * Accesor Singleton para obtener la única instancia del repositorio.
     * 
     * @return La instancia única de ListaTalleres.
     */
    public static ListaTalleres getInstance() {
        if (instance == null) {
            instance = new ListaTalleres();
        }
        return instance;
    }

    /**
     * Regresa la lista completa de talleres.
     * 
     * @return Lista de objetos Taller.
     */
    public List<Taller> getTalleres() {
        return talleres;
    }
}
