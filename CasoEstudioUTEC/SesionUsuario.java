import java.time.LocalDateTime;

public class SesionUsuario {
    private int id; // Identificador único de la sesión
    private Usuario usuario; // Usuario asociado a la sesión
    private String token; // Token de sesión
    private LocalDateTime fechaInicio; // Fecha y hora de inicio de la sesión
    private LocalDateTime fechaExpiracion; // Fecha y hora de expiración de la sesión
    private EstadoSesion estado; // Estado de la sesión (ACTIVO, CERRADO, EXPIRADO)

    // Constructor
    public SesionUsuario(int id, Usuario usuario, String token, LocalDateTime fechaInicio, LocalDateTime fechaExpiracion) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
        this.fechaInicio = fechaInicio;
        this.fechaExpiracion = fechaExpiracion;
        this.estado = EstadoSesion.ACTIVO; // Por defecto, la sesión está activa
    }

    // Getters y Setters
    public int getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public String getToken() { return token; }
    public LocalDateTime getFechaInicio() { return fechaInicio; }
    public LocalDateTime getFechaExpiracion() { return fechaExpiracion; }
    public EstadoSesion getEstado() { return estado; }

    public void cerrarSesion() {
        this.estado = EstadoSesion.CERRADO; // Cambia el estado a cerrado
    }

    // Método para verificar si la sesión está activa
    public boolean isActiva() {
        return estado == EstadoSesion.ACTIVO && LocalDateTime.now().isBefore(fechaExpiracion);
    }
    @Override
    public String toString() {
        return "SesionUsuario{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", token='" + token + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaExpiracion=" + fechaExpiracion +
                ", estado=" + estado +
                '}';
    }

}
