
import java.util.List;
import java.util.Objects;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String numeroTelefono;
    private String correoElectronico;
    private String contrasena; // Debe guardarse encriptada
    private String sede;
    private Rol rol;

    // Constructor principal
    public Usuario(int id, String nombre, String apellido, String numeroTelefono, String correoElectronico, String contrasena, String sede, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.sede = sede;
        this.rol = rol;
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

    public String getNumeroTelefono() { return numeroTelefono; }
    public void setNumeroTelefono(String numeroTelefono) { this.numeroTelefono = numeroTelefono; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }

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
                '}';
    }
}
