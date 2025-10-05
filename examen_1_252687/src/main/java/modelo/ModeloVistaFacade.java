package modelo;

import java.util.List;

import vista.PantallaInscripcion;

public class ModeloVistaFacade implements IModeloVista {

    @Override
    public void mostrarAlumno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarAlumno'");
    }

    @Override
    public void mostrarDetallesTaller() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarDetallesTaller'");
    }

    @Override
    public void mostrarTicket() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarTicket'");
    }

    @Override
    public void agregarTaller(TallerVista taller) {
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
