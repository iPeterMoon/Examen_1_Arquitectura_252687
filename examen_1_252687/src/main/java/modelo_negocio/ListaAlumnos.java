package modelo_negocio;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class ListaAlumnos {
    private List<Alumno> alumnos;

    private static ListaAlumnos instance;

    private ListaAlumnos(){
        this.alumnos = new LinkedList<>();

        // Datos mock para pruebas
        this.alumnos.add(new Alumno("123456", "María Pérez", "3", "Ingeniería"));
        this.alumnos.add(new Alumno("456789", "Juan López", "5", "Sistemas"));
        this.alumnos.add(new Alumno("252687", "Ana García", "2", "Arquitectura"));
        this.alumnos.add(new Alumno("123123", "Luis Martínez", "7", "Electrónica"));
        this.alumnos.add(new Alumno("111111", "Sofía Torres", "1", "Diseño"));
    }

    // Singleton accessor
    public static ListaAlumnos getInstance(){
        if(instance == null){
            instance = new ListaAlumnos();
        }
        return instance;
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public List<Alumno> getAlumnos(){
        return alumnos;
    }
}
