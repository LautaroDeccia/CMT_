
import java.util.List;
import java.util.Objects;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String numeroTelefono;
    private String correoElectronico;
    private String contrasena; // Debe guardarse encriptada
    private String sede;
    private Rol rol;

    // Atributos específicos para el rol ESTUDIANTE
    private String historialMedico;
    private String historialPsicologico;
    private List<ArchivoAdjunto> archivosAdjuntos;
    private boolean activo;
    private List<Comentario> comentarios;
    private NivelUrgencia nivelUrgencia;

    // Constructor principal
    public Usuario(int id, String nombre, String apellido,String numeroTelefono, String correoElectronico, String contrasena,sede, Rol rol,
                   String historialMedico, String historialPsicologico,
                   List<ArchivoAdjunto> archivosAdjuntos, boolean activo,
                   List<Comentario> comentarios, NivelUrgencia nivelUrgencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.sede = sede;
        this.rol = rol;
        this.historialMedico = historialMedico;
        this.historialPsicologico = historialPsicologico;
        this.archivosAdjuntos = archivosAdjuntos;
        this.activo = activo;
        this.comentarios = comentarios;
        this.nivelUrgencia = nivelUrgencia;
    }

    // Constructor vacío
    public Usuario() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.numeroTelefono = "";
        this.correoElectronico = "";
        this.contrasena = "";
        this.sede = "";
        this.rol = null;
    }

    // Getters y Setters generales
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getNumeroTelefono(){ return numeroTelefono; }
    public void setNumeroTelefono(String numeroTelefono) { this.numeroTelefono = numeroTelefono;}

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }

    // Getters y Setters específicos para estudiantes
    public String getHistorialMedico() { return historialMedico; }
    public void setHistorialMedico(String historialMedico) { this.historialMedico = historialMedico; }

    public String getHistorialPsicologico() { return historialPsicologico; }
    public void setHistorialPsicologico(String historialPsicologico) { this.historialPsicologico = historialPsicologico; }

    public List<ArchivoAdjunto> getArchivosAdjuntos() { return archivosAdjuntos; }
    public void setArchivosAdjuntos(List<ArchivoAdjunto> archivosAdjuntos) { this.archivosAdjuntos = archivosAdjuntos; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public List<Comentario> getComentarios() { return comentarios; }
    public void setComentarios(List<Comentario> comentarios) { this.comentarios = comentarios; }

    public NivelUrgencia getNivelUrgencia() { return nivelUrgencia; }
    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) { this.nivelUrgencia = nivelUrgencia; }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", rol=" + (rol != null ? rol.toString() : "null") +
                (rol == Rol.ESTUDIANTE ?
                        ", activo=" + activo +
                                ", nivelUrgencia=" + nivelUrgencia : "") +
                '}';
    }
}

