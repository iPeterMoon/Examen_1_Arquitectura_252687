package modelo;

/**
 * TicketSubject.java
 * 
 * Clase que representa la entidad Ticket de inscripción como un Subject.
 * Contiene el resultado final de la transacción de inscripción.
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class TicketSubject extends Subject {
    private TallerSubject taller;
    private AlumnoSubject alumno;
    private String fechaRegistro;
    private String folio;

    /**
     * Constructor para crear un TicketSubject con todos los datos de registro.
     * 
     * @param taller        Taller en el que se inscribió el alumno.
     * @param alumno        Alumno que se inscribió.
     * @param fechaRegistro Fecha y hora exacta de la inscripción.
     * @param folio         Folio de identificación único del ticket.
     */
    public TicketSubject(TallerSubject taller, AlumnoSubject alumno, String fechaRegistro, String folio) {
        this.taller = taller;
        this.alumno = alumno;
        this.fechaRegistro = fechaRegistro;
        this.folio = folio;
    }

    /**
     * Regresa el Taller asociado al ticket.
     * 
     * @return TallerSubject del ticket.
     */
    public TallerSubject getTaller() {
        return taller;
    }

    /**
     * Regresa el Alumno asociado al ticket.
     * 
     * @return AlumnoSubject del ticket.
     */
    public AlumnoSubject getAlumno() {
        return alumno;
    }

    /**
     * Regresa la fecha de registro del ticket.
     * 
     * @return Fecha de registro.
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Regresa el folio único del ticket.
     * 
     * @return Folio del ticket.
     */
    public String getFolio() {
        return folio;
    }

}
