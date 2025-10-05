package control;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;
import modelo.IModeloControl;
import modelo.ModeloControlImp;

public class ControlInscribirTaller {
    
    public void seleccionarTaller(String nombre) {
        IModeloControl modelo = new ModeloControlImp();
        modelo.seleccionarTaller(nombre);
    }

    public void inscribir(String idAlumno) throws InscripcionNoValidaException{
        IModeloControl modelo = new ModeloControlImp();
        modelo.inscribir(idAlumno);
    }

    public void validarID(String idAlumno) throws AlumnoNoEncontradoException{
        IModeloControl modelo = new ModeloControlImp();
        modelo.validarID(idAlumno);
    }
}
