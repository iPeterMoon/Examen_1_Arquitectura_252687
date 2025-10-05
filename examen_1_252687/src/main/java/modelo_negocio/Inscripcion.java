package modelo_negocio;

/**
 * Inscripcion.java
 * 
 * Clase de Entidad que representa el registro (Ticket) de la inscripción de un Alumno a un Taller.
 * Es el resultado de la transacción exitosa.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class Inscripcion {
    private Alumno alumno;
    private Taller taller;
    private String folio;
    private String fechaRegistro;

    /**
     * Constructor para crear una nueva inscripción.
     * @param alumno El alumno inscrito.
     * @param taller El taller seleccionado.
     * @param folio Folio de identificación único generado.
     * @param fechaRegistro Fecha y hora exacta del registro.
     */
    public Inscripcion(Alumno alumno, Taller taller, String folio, String fechaRegistro) {
        this.alumno = alumno;
        this.taller = taller;
        this.folio = folio;
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Regresa el alumno asociado a esta inscripción.
     * @return El objeto Alumno.
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * Regresa el taller asociado a esta inscripción.
     * @return El objeto Taller.
     */
    public Taller getTaller() {
        return taller;
    }

    /**
     * Regresa el folio de la inscripción.
     * @return El folio.
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Regresa la fecha y hora de registro.
     * @return La fecha de registro.
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    
}
