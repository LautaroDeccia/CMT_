import java.util.ArrayList;
import java.util.List;

public class HistorialEstudiante {
    private EstudianteUsuario estudiante;
    private List<SolicitudAsistencia> solicitudes;

    // Constructor necesario porque esta clase también guarda estado (estudiante y sus solicitudes)
    public HistorialEstudiante(EstudianteUsuario estudiante) {
        this.estudiante = estudiante;
        this.solicitudes = new ArrayList<>();
    }

    public void agregarSolicitud(SolicitudAsistencia solicitud) {
        this.solicitudes.add(solicitud);
    }

    public List<SolicitudAsistencia> getSolicitudes() {
        return solicitudes;
    }

    public EstudianteUsuario getEstudiante() {
        return estudiante;
    }
}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Historial del estudiante: ").append(estudiante.getNombre()).append("\n");
        sb.append("Solicitudes realizadas:\n");
        for (SolicitudAsistencia solicitud : solicitudes) {
            sb.append(" - ").append(solicitud.toString()).append("\n");
        }
        return sb.toString();
    }
}
