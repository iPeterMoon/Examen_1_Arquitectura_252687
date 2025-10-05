package modelo;

import vista.IObserver;
import vista.ModelObserver;
import vista.PantallaInscripcion;

/**
 * ModeloVistaFacade.java
 * 
 * Implementación de IModeloVista que simplifica la interacción del Modelo de
 * negocio con la vista en el contexto de la capa Vista (notificaciones de actualización de datos).
 *
 * @author Pedro Luna Esquer - 252687
 */
public class ModeloVistaFacade implements IModeloVista {

    /**
     * Muestra los datos del alumno en la Vista.
     * Registra temporalmente un observer en el AlumnoSubject y notifica.
     * 
     * @param alumno El Subject con los datos del alumno.
     */
    @Override
    public void mostrarAlumno(AlumnoSubject alumno) {
        IObserver observer = new ModelObserver();
        alumno.addObserver(observer);
        alumno.notifyAllObservers();
    }

    /**
     * Muestra los detalles del taller en la Vista.
     * Registra temporalmente un observer en el TallerSubject y notifica.
     * 
     * @param taller El Subject con los detalles del taller.
     */
    @Override
    public void mostrarDetallesTaller(TallerSubject taller) {
        IObserver observer = new ModelObserver();
        taller.addObserver(observer);
        taller.notifyAllObservers();
    }

    /**
     * Muestra el ticket de inscripción en la Vista.
     * Registra temporalmente un observer en el TicketSubject y notifica.
     * 
     * @param ticket El Subject con la información del ticket.
     */
    @Override
    public void mostrarTicket(TicketSubject ticket) {
        IObserver observer = new ModelObserver();
        ticket.addObserver(observer);
        ticket.notifyAllObservers();
    }

    /**
     * Agrega un taller a la lista global y dispara la notificación de actualización
     * de la lista de talleres en la Vista.
     * 
     * @param taller El Subject del taller a agregar.
     */
    @Override
    public void agregarTaller(TallerSubject taller) {
        ListaTalleresSubject listaTalleres = ListaTalleresSubject.getInstance();
        listaTalleres.agregarTaller(taller);
    }

    /**
     * Muestra la pantalla principal de la aplicación.
     */
    @Override
    public void mostrarPantalla() {
        PantallaInscripcion pantalla = PantallaInscripcion.getInstance();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.setResizable(false);
    }

}
