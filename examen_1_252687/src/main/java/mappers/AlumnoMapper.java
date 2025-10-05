package mappers;

import modelo.AlumnoSubject;
import modelo_negocio.Alumno;

/**
 * AlumnoMapper.java
 * 
 * Clase que mapea las clases del modelo-negocio a las clases del modelo-vista
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class AlumnoMapper {

    /**
     * Método que convierte una clase Alumno de modelo-negocio a una instancia de la
     * clase AlumnoSubject del modelo (vista)
     * 
     * @param alumno Alumno a mapear
     * @return AlumnoSubject con los mismos datos del alumno
     */
    public static AlumnoSubject toVista(Alumno alumno) {
        String id = alumno.getId();
        String nombre = alumno.getNombre();
        String semestre = alumno.getSemestre();
        String programa = alumno.getPrograma();
        return new AlumnoSubject(id, nombre, semestre, programa);
    }

}
