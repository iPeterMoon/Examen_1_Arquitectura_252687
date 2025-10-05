package modelo;

/**
 * AlumnoSubject.java
 * 
 * Clase que representa el alumno del que se ingresó el ID en el caso de uso
 * Extiende subject para notificar cuando es establecido.
 * 
 * @author Pedro Luna Esquer
 */
public class AlumnoSubject extends Subject{
    

    private String id;
    private String nombre;
    private String semestre;
    private String programa;

    public AlumnoSubject(String id, String nombre, String semestre, String programa) {
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
