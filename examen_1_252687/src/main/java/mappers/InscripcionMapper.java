package mappers;

import modelo.AlumnoSubject;
import modelo.TallerSubject;
import modelo.TicketSubject;
import modelo_negocio.Inscripcion;

/**
 * InscripcionMapper.java
 * 
 * Clase que mapea una inscripción del modelo-negocio al modelo-vista, sirve
 * para presentar la información de la inscripción en forma de ticket
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class InscripcionMapper {

    /**
     * Metodo que mapea una clase Inscripcion del modelo-negocio a una clase
     * TicketSubject del modelo(vista) con sus mismos datos
     * 
     * @param inscripcion Inscripcion a convertir en ticket
     * @return Ticket con los datos de la inscripción
     */
    public static TicketSubject toTicket(Inscripcion inscripcion) {
        TallerSubject taller = TallerMapper.toVista(inscripcion.getTaller());
        AlumnoSubject alumno = AlumnoMapper.toVista(inscripcion.getAlumno());
        String folio = inscripcion.getFolio();
        String fechaRegistro = inscripcion.getFechaRegistro();
        return new TicketSubject(taller, alumno, fechaRegistro, folio);
    }
}
