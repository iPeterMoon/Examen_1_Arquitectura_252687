package modelo_negocio;

import java.util.Date;

public class Taller {
    
    private String nombre;
    private String instructor;
    private String fechaYHora;
    private int cupo;

    public Taller(String nombre, String instructor, String fechaYHora, int cupo) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.fechaYHora = fechaYHora;
        this.cupo = cupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}
