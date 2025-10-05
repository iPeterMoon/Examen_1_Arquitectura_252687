package modelo;

import modelo_negocio.IModeloNegocio;
import modelo_negocio.ModeloNegocioImp;

public class ModeloControlImp implements IModeloControl {

    @Override
    public void seleccionarTaller(String nombreTaller) {
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.seleccionarTaller(nombreTaller);
    }

    @Override
    public void inscribir(String nombreTaller, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inscribir'");
    }

    @Override
    public void confirmarInscripcion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmarInscripcion'");
    }

    @Override
    public void validarID(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarID'");
    }
    
}
