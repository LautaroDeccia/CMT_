import java.time.LocalDateTime;
public class SolicitudAsistencia {
//Atributos
    private int id;
    private String estudiante;
    private String descripcion;
    private LocaleDateTime fecha;
//Constructor Principal
    public SolicitudAsistencia(int id, LocaleDateTime fecha, String descripcion, String estudiante) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estudiante = estudiante;
    }
//Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocaleDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocaleDateTime fecha) {
        this.fecha = fecha;
    }
    // Método toString()
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", estudiante='" + estudiante + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + (fecha != null ? fecha.toString() : "null") +
                '}';
    }
}
