package modelo_negocio;

/**
 * Taller.java
 * 
 * Clase de Entidad que representa un Taller de la Semana ISW.
 * Contiene los datos necesarios para la inscripción y el cupo.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class Taller {

    private String nombre;
    private String instructor;
    private String fechaYHora;
    private int cupo;

    /**
     * Constructor para inicializar la entidad Taller.
     * 
     * @param nombre     Nombre completo del taller.
     * @param instructor Nombre del instructor.
     * @param fechaYHora Fecha y horario del taller.
     * @param cupo       Cupo disponible.
     */
    public Taller(String nombre, String instructor, String fechaYHora, int cupo) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.fechaYHora = fechaYHora;
        this.cupo = cupo;
    }

    /**
     * Regresa el nombre del taller.
     * 
     * @return Nombre del taller.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el nombre del instructor.
     * 
     * @return Nombre del instructor.
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * Regresa la fecha y hora del taller.
     * 
     * @return Fecha y hora.
     */
    public String getFechaYHora() {
        return fechaYHora;
    }

    /**
     * Regresa el cupo disponible.
     * 
     * @return Cantidad de cupo.
     */
    public int getCupo() {
        return cupo;
    }

    /**
     * Establece el cupo disponible.
     * 
     * @param cupo Nueva cantidad de cupo.
     */
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}
