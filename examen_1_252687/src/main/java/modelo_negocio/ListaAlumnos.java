package modelo_negocio;

import java.util.LinkedList;
import java.util.List;

/**
 * ListaAlumnos.java
 * 
 * Repositorio de datos para los objetos Alumno (simula la base de datos).
 * Implementa el patrón Singleton.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class ListaAlumnos {
    private List<Alumno> alumnos;

    private static ListaAlumnos instance;

    /**
     * Constructor privado que inicializa el repositorio con datos de prueba (mock).
     */
    private ListaAlumnos() {
        this.alumnos = new LinkedList<>();

        // Datos mock para pruebas
        this.alumnos.add(new Alumno("123456", "María Pérez", "3", "Ingeniería"));
        this.alumnos.add(new Alumno("456789", "Juan López", "5", "Sistemas"));
        this.alumnos.add(new Alumno("252687", "Ana García", "2", "Arquitectura"));
        this.alumnos.add(new Alumno("123123", "Luis Martínez", "7", "Electrónica"));
        this.alumnos.add(new Alumno("111111", "Sofía Torres", "1", "Diseño"));
    }

    /**
     * Accesor Singleton para obtener la única instancia del repositorio.
     * 
     * @return La instancia única de ListaAlumnos.
     */
    public static ListaAlumnos getInstance() {
        if (instance == null) {
            instance = new ListaAlumnos();
        }
        return instance;
    }

    /**
     * Agrega un nuevo alumno al repositorio.
     * 
     * @param alumno Alumno a agregar.
     */
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    /**
     * Regresa la lista completa de alumnos.
     * 
     * @return Lista de objetos Alumno.
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
