package modelo_negocio;

import java.util.List;

import mappers.TallerMapper;
import modelo.IModeloVista;
import modelo.ModeloVistaFacade;

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
    
    /**
     * Carga los talleres hacia el modelo de la vista
     */
    private void cargarTalleres(){
        ListaTalleres listaTalleres = ListaTalleres.getInstance();
        List<Taller> talleres = listaTalleres.getTalleres();
        IModeloVista modeloVista = new ModeloVistaFacade();
        for(Taller taller : talleres){
            modeloVista.agregarTaller(TallerMapper.toVista(taller));
        } 
    }

    @Override
    public void empezarCasoUso() {
        IModeloVista modeloVista = new ModeloVistaFacade();
        cargarTalleres();
        modeloVista.mostrarPantalla();
    }

}
