package modelo;

import java.util.List;

import vista.IObserver;
import vista.ModelObserver;
import vista.PantallaInscripcion;

public class ModeloVistaFacade implements IModeloVista {

    @Override
    public void mostrarAlumno(AlumnoSubject alumno) {
        IObserver observer = new ModelObserver();
        alumno.addObserver(observer);
        alumno.notifyAllObservers();
    }

    @Override
    public void mostrarDetallesTaller(TallerSubject taller) {
        IObserver observer = new ModelObserver();
        taller.addObserver(observer);
        taller.notifyAllObservers();
    }

    @Override
    public void mostrarTicket(TicketSubject ticket) {
        IObserver observer = new ModelObserver();
        ticket.addObserver(observer);
        ticket.notifyAllObservers();
    }

    @Override
    public void agregarTaller(TallerSubject taller) {
        ListaTalleresSubject listaTalleres = ListaTalleresSubject.getInstance();
        listaTalleres.agregarTaller(taller);
    }

    @Override
    public void mostrarPantalla() {
        PantallaInscripcion pantalla = PantallaInscripcion.getInstance();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.setResizable(false);
    }

}
