
public class Usuario {
    private int id;
    private String nombre;
    private String correoElectronico;
    private String contrasena; // Debe guardarse encriptada
    private Rol rol;

    // Constructor principal
    public Usuario(int id, String nombre, String correoElectronico, String contrasena, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // Constructor vacío
    public Usuario() {
        this.id = "";
        this.nombre = "";
        this.correoElectronico = "";
        this.contrasena = "";
        this.rol = null;
    }
    // Constructor vacío

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método toString()
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", rol=" + (rol != null ? rol.toString() : "null") +
                '}';
    }
}


