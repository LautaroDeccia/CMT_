public class Incidencia {
    // Atributos
    private int id;
    private String descripcion;
    private String estado;

    // Constructor
    public Incidencia(int id, String descripcion, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    // Método para presentar la información de la incidencia
    @Override
    public String toString() {
        return "Incidencia ID: " + id + ", Descripción: " + descripcion + ", Estado: " + estado;
    }
}
