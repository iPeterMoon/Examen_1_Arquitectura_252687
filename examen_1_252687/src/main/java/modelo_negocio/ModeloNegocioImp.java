package modelo_negocio;

public class ModeloNegocioImp implements IModeloNegocio {

    private static ModeloNegocioImp instance;

    private ModeloNegocioImp(){

    }

    public static ModeloNegocioImp getInstance(){
        if(instance == null){ 
            instance = new ModeloNegocioImp();
        }
        return instance;
    }

    private Taller tallerSeleccionado;

    @Override
    public void seleccionarTaller(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seleccionarTaller'");
    }

    @Override
    public void confirmarInscripcion(String nombreTaller, String idAlumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmarInscripcion'");
    }

    @Override
    public void validarID(String idAlumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarID'");
    }
    
}
