public class RegistroAuditoria {
    private String id;
    private LocalDateTime fechaHora;
    private String usuario;
    private String descripcion;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public RegistroAuditoria(String id, LocalDateTime fechaHora, String usuario, String descripcion) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "RegistroAuditoria{" +
                "id='" + id + '\'' +
                ", fechaHora=" + fechaHora +
                ", usuario='" + usuario + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
