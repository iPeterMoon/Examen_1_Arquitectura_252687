package modelo_negocio;

/**
 *
 * @author pedro
 */
public class Inscripcion {
    private Alumno alumno;
    private Taller taller;
    private String folio;
    private String fechaRegistro;

    public Inscripcion(Alumno alumno, Taller taller, String folio, String fechaRegistro) {
        this.alumno = alumno;
        this.taller = taller;
        this.folio = folio;
        this.fechaRegistro = fechaRegistro;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
