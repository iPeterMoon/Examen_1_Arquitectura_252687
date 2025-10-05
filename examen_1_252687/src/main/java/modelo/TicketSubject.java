package modelo;

public class TicketSubject extends Subject {
    private TallerSubject taller;
    private AlumnoSubject alumno;
    private String fechaRegistro;
    private String folio;

    public TicketSubject(TallerSubject taller, AlumnoSubject alumno, String fechaRegistro, String folio) {
        this.taller = taller;
        this.alumno = alumno;
        this.fechaRegistro = fechaRegistro;
        this.folio = folio;
    }

    public TallerSubject getTaller() {
        return taller;
    }

    public void setTaller(TallerSubject taller) {
        this.taller = taller;
    }

    public AlumnoSubject getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoSubject alumno) {
        this.alumno = alumno;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    
}
