public class Permisos {
    // **Atributos**
    private String nombrePermiso; // Nombre del permiso
    private boolean permitido;     // Indica si el permiso está permitido o no

    // **Constructor**
    public Permisos(String nombrePermiso, boolean permitido) {
        this.nombrePermiso = nombrePermiso;
        this.permitido = permitido;
    }

    // **Métodos**

    // Obtener nombre del permiso
    public String getNombrePermiso() {
        return nombrePermiso;
    }

    // Establecer nombre del permiso
    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    // Verificar si el permiso está permitido
    public boolean isPermitido() {
        return permitido;
    }

    // Establecer estado del permiso
    public void setPermitido(boolean permitido) {
        this.permitido = permitido;
    }

    @Override
    public String toString() {
        return "Permisos{" +
                "nombrePermiso='" + nombrePermiso + '\'' +
                ", permitido=" + permitido +
                '}';
    }
}
