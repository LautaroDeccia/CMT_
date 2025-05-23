import java.util.List;

public class Estudiante {
    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String historialMedico;
    private String historialPsicologico;
    private List<ArchivoAdjunto> archivosAdjuntos;
    private boolean activo;
    private List<Comentario> comentarios;
    private NivelUrgencia nivelUrgencia;

    // Constructor
    public Estudiante(int id, String nombre, String apellido, String correoElectronico,
                      String historialMedico, String historialPsicologico,
                      List<ArchivoAdjunto> archivosAdjuntos, boolean activo,
                      List<Comentario> comentarios, NivelUrgencia nivelUrgencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.historialMedico = historialMedico;
        this.historialPsicologico = historialPsicologico;
        this.archivosAdjuntos = archivosAdjuntos;
        this.activo = activo;
        this.comentarios = comentarios;
        this.nivelUrgencia = nivelUrgencia;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getHistorialPsicologico() {
        return historialPsicologico;
    }

    public void setHistorialPsicologico(String historialPsicologico) {
        this.historialPsicologico = historialPsicologico;
    }

    public List<ArchivoAdjunto> getArchivosAdjuntos() {
        return archivosAdjuntos;
    }

    public void setArchivosAdjuntos(List<ArchivoAdjunto> archivosAdjuntos) {
        this.archivosAdjuntos = archivosAdjuntos;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public NivelUrgencia getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", activo=" + activo +
                ", nivelUrgencia=" + nivelUrgencia +
                '}';
    }
}

