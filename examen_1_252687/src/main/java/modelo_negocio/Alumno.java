package modelo_negocio;

/**
 * Alumno.java
 * 
 * Clase de Entidad que representa a un alumno guardado en el sistema
 * (la base de datos o repositorio simulado).
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class Alumno {

    private String id;
    private String nombre;
    private String semestre;
    private String programa;

    /**
     * Constructor para inicializar la entidad Alumno.
     * 
     * @param id       ID único del alumno.
     * @param nombre   Nombre completo del alumno.
     * @param semestre Semestre que cursa.
     * @param programa Programa educativo al que pertenece.
     */
    public Alumno(String id, String nombre, String semestre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = programa;
    }

    /**
     * Regresa el ID del alumno.
     * 
     * @return El ID del alumno.
     */
    public String getId() {
        return id;
    }

    /**
     * Regresa el nombre del alumno.
     * 
     * @return El nombre completo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el semestre del alumno.
     * 
     * @return El semestre.
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Regresa el programa educativo del alumno.
     * 
     * @return El programa.
     */
    public String getPrograma() {
        return programa;
    }

}
