package mappers;

import modelo.AlumnoSubject;
import modelo.TallerSubject;
import modelo.TicketSubject;
import modelo_negocio.Inscripcion;

public class InscripcionMapper {
    
    public static TicketSubject toTicket(Inscripcion inscripcion){
        TallerSubject taller = TallerMapper.toVista(inscripcion.getTaller());
        AlumnoSubject alumno = AlumnoMapper.toVista(inscripcion.getAlumno());
        String folio = inscripcion.getFolio();
        String fechaRegistro = inscripcion.getFechaRegistro();
        return new TicketSubject(taller, alumno, fechaRegistro, folio);
    }
}
