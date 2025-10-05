package mappers;

import modelo.TallerVista;
import modelo_negocio.Taller;

/**
 * TallerMapper.java
 * 
 * Clase utilitaia para pasar objetos del modelo de negocios al modelo de vista
 * Mapper que convierte objetos.
 * 
 * @author Pedro Luna Esquer
 */
public class TallerMapper {
    
    public static TallerVista toVista(Taller taller){
        String nombre = taller.getNombre();
        String instructor = taller.getInstructor();
        String fechaYHora = taller.getFechaYHora();
        int cupo = taller.getCupo();
        return new TallerVista(nombre, instructor, fechaYHora, cupo);
    }

}
