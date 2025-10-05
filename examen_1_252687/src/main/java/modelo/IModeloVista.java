package modelo;

/**
 * IModeloVista.java
 * 
 * Interfaz Fachada que simplifica la interacción del Modelo-Negocio con el Modelo (Vista)
 * Se utiliza para notificar cambios específicos a la Vista
 * 
 * @author Pedro Luna Esquer - 252687
 */
public interface IModeloVista {
    
    /**
     * Muestra los datos de un alumno en la Vista notificando al respectivo Subject.
     * @param alumno El Subject que contiene los datos del alumno encontrado.
     */
    public void mostrarAlumno(AlumnoSubject alumno);

    /**
     * Muestra los detalles de un taller en la Vista notificando al respectivo Subject.
     * @param taller El Subject que contiene los detalles del taller seleccionado.
     */
    public void mostrarDetallesTaller(TallerSubject taller);

    /**
     * Muestra el ticket de inscripción generado en la Vista notificando al respectivo Subject.
     * @param ticket El Subject que contiene la información del ticket.
     */
    public void mostrarTicket(TicketSubject ticket);
    
    /**
     * Agrega un nuevo taller a la lista de talleres disponibles y notifica a la Vista.
     * @param taller El Subject del taller a agregar.
     */
    public void agregarTaller(TallerSubject taller);

    /**
     * Muestra la pantalla principal de inscripción.
     */
    public void mostrarPantalla();

}
