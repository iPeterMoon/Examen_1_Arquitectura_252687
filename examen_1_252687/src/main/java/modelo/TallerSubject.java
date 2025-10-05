package modelo;

/**
 * TallerSubject.java
 * 
 * Clase que representa un taller como una entidad observada (Subject)
 * Contiene los datos del taller que se muestran en la vista
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class TallerSubject extends Subject {

    private String nombre;

    private String instructor;

    private String fechaYHora;

    private int cupo;

    /**
     * Constructor para inicializar un TallerSubject.
     * 
     * @param nombre     Nombre del taller.
     * @param instructor Nombre del instructor.
     * @param fechaYHora Fecha y horario del taller.
     * @param cupo       Cupo disponible para el taller.
     */
    public TallerSubject(String nombre, String instructor, String fechaYHora, int cupo) {
        super();
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
     * @return Fecha y hora del taller.
     */
    public String getFechaYHora() {
        return fechaYHora;
    }

    /**
     * Regresa el cupo disponible.
     * 
     * @return Cupo disponible.
     */
    public int getCupo() {
        return cupo;
    }

}
