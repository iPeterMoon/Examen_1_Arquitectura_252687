package control;

import modelo.IModeloControl;
import modelo.ModeloControlImp;

public class ControlInscribirTaller {
    
    public void seleccionarTaller(String nombre) {
        IModeloControl modelo = new ModeloControlImp();
        modelo.seleccionarTaller(nombre);
    }

    public void confirmarInscripcion(String nombreTaller, String idAlumno){

    }

    public void validarID(String idAlumno){

    }
}
