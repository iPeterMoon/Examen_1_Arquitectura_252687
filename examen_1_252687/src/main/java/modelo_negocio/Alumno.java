package modelo_negocio;
/**
 * AlumnoSubject.java
 * 
 * Clase que representa un alumno guardado en la base de datos.
 * 
 * @author Pedro Luna Esquer
 */
public class Alumno {
    
    private String id;
    private String nombre;
    private String semestre;
    private String programa;

    public Alumno(String id, String nombre, String semestre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = programa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
}
