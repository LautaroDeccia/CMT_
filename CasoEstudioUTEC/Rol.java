import java.util.List;

public class Rol {
    private String nombre;
    private List<String> permisos;

    public Rol(String nombre, List<String> permisos) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del rol no puede estar vacío.");
        }
        this.nombre = nombre;
        this.permisos = permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del rol no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<String> permisos) {
        this.permisos = permisos;
    }

    public boolean tienePermiso(String permiso) {
        return permisos.contains(permiso);
    }

    @Override
    public String toString() {
        return "Rol{" +
                "nombre='" + nombre + '\'' +
                ", permisos=" + permisos +
                '}';
    }
}

