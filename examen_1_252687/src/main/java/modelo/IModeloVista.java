package modelo;

import java.util.List;

/**
 *
 * @author pedro
 */
public interface IModeloVista {
    
    public void mostrarAlumno();

    public void mostrarDetallesTaller(TallerSubject taller);

    public void mostrarTicket();
    
    public void agregarTaller(TallerSubject taller);

    public void mostrarPantalla();

}
