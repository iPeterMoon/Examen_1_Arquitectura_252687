package modelo;

import exceptions.AlumnoNoEncontradoException;
import exceptions.InscripcionNoValidaException;
import modelo_negocio.IModeloNegocio;
import modelo_negocio.ModeloNegocioImp;

public class ModeloControlImp implements IModeloControl {

    @Override
    public void seleccionarTaller(String nombreTaller) {
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.seleccionarTaller(nombreTaller);
    }
    
    @Override
    public void inscribir(String idAlumno) throws InscripcionNoValidaException{
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.inscribir(idAlumno);
    }
    
    @Override
    public void validarID(String id) throws AlumnoNoEncontradoException{
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.validarID(id);
    }
    
}
