public class Notificacion {
    private String titulo;
    private String mensaje;
    private String importancia; // O enum

    public Notificacion(String titulo, String mensaje, String importancia) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.importancia = importancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public void mostrarNotificacion() {
        System.out.println("[" + importancia + "] " + titulo + ": " + mensaje);
    }
}
