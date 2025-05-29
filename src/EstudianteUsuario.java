import java.util.List;

public class EstudianteUsuario extends Usuario {
    private String historialMedico;
    private String historialPsicologico;
    private List<ArchivoAdjunto> archivoAdjunto;
    private boolean activo;
    private List<Comentario> comentarios;
    private NivelUrgencia nivelUrgencia;

    // Constructor
    public EstudianteUsuario(int id, String nombre, String apellido, String numeroTelefono, String correoElectronico, String contrasena, String sede, Rol rol,
                             String historialMedico, String historialPsicologico, List<ArchivoAdjunto> archivoAdjunto, boolean activo,
                             List<Comentario> comentarios, NivelUrgencia nivelUrgencia) {
        super(id, nombre, apellido, numeroTelefono, correoElectronico, contrasena, sede, rol);
        this.historialMedico = historialMedico;
        this.historialPsicologico = historialPsicologico;
        this.archivoAdjunto = archivoAdjunto;
        this.activo = activo;
        this.comentarios = comentarios;
        this.nivelUrgencia = nivelUrgencia;
    }

    // Getters y Setters específicos para estudiantes
    public String getHistorialMedico() { return historialMedico; }
    public void setHistorialMedico(String historialMedico) { this.historialMedico = historialMedico; }

    public String getHistorialPsicologico() { return historialPsicologico; }
    public void setHistorialPsicologico(String historialPsicologico) { this.historialPsicologico = historialPsicologico; }

    public List<ArchivoAdjunto> getArchivoAdjunto() { return archivoAdjunto; }
    public void setArchivoAdjunto(List<ArchivoAdjunto> archivoAdjunto) { this.archivoAdjunto = archivoAdjunto; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public List<Comentario> getComentarios() { return comentarios; }
    public void setComentarios(List<Comentario> comentarios) { this.comentarios = comentarios; }

    public NivelUrgencia getNivelUrgencia() { return nivelUrgencia; }
    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) { this.nivelUrgencia = nivelUrgencia; }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", EstudianteUsuario{" +
                "historialMedico='" + historialMedico + '\'' +
                ", historialPsicologico='" + historialPsicologico + '\'' +
                ", activo=" + activo +
                ", nivelUrgencia=" + nivelUrgencia +
                '}';
    }
}
