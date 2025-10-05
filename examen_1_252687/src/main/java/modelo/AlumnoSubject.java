package modelo;

/**
 * AlumnoSubject.java
 * 
 * Clase que representa el alumno del que se ingresó el ID en el caso de uso
 * Extiende subject para notificar cuando es establecido.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class AlumnoSubject extends Subject {

    /**
     * Id del alumno
     */
    private String id;
    /**
     * Nombre del alumno
     */
    private String nombre;
    /**
     * Semestre que cursa el alumno
     */
    private String semestre;
    /**
     * Programa educativo que cursa el alumno
     */
    private String programa;

    /**
     * Constructor de la clase alumnoSubject que recibe todos los datos del alumno
     * @param id Id del alumno
     * @param nombre Nombre del alumno
     * @param semestre Semestre que cursa el alumno
     * @param programa Programa educativo que cursa el alumno
     */
    public AlumnoSubject(String id, String nombre, String semestre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = programa;
    }

    /**
     * Regresa el id del alumno
     * @return Id del alumno
     */
    public String getId() {
        return id;
    }
    /**
     * Regresa el nombre completo del alumno.
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el semestre que cursa el alumno.
     * @return Semestre del alumno.
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Regresa el programa educativo al que pertenece el alumno.
     * @return Programa educativo del alumno.
     */
    public String getPrograma() {
        return programa;
    }
    
}
