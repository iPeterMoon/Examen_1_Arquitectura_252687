package mappers;

import modelo.AlumnoSubject;
import modelo_negocio.Alumno;

/**
 *
 * @author pedro
 */
public class AlumnoMapper {
    
    public static AlumnoSubject toVista(Alumno alumno){
        String id = alumno.getId();
        String nombre = alumno.getNombre();
        String semestre = alumno.getSemestre();
        String programa = alumno.getPrograma();
        return new AlumnoSubject(id, nombre, semestre, programa);
    }

}
