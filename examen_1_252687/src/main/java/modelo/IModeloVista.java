package modelo;

/**
 *
 * @author pedro
 */
public interface IModeloVista {
    
    public void mostrarAlumno(AlumnoSubject alumno);

    public void mostrarDetallesTaller(TallerSubject taller);

    public void mostrarTicket(TicketSubject ticket);
    
    public void agregarTaller(TallerSubject taller);

    public void mostrarPantalla();

}
