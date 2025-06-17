public class InstanciaSeguimiento {
    // Atributos de la clase
    private String id;
    private String descripcion;
    private String estado;
    private String fechaCreacion;
    //fUNCIONARIO?
    // Constructor
    public InstanciaSeguimiento(String id, String descripcion, String estado, String fechaCreacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

    // Métodos getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // Método para mostrar información de la instancia
    @Override
    public String toString() {
        return "InstanciaSeguimiento{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }
}
