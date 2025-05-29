
public class ArchivoAdjunto {
    private String nombreArchivo;
    private byte[] contenido;
    private String tipoContenido;

    // Constructor
    public ArchivoAdjunto(String nombreArchivo, byte[] contenido, String tipoContenido) {
        this.nombreArchivo = nombreArchivo;
        this.contenido = contenido;
        this.tipoContenido = tipoContenido;
    }

    // Getters
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    // Setters
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    // toString (sin imprimir el contenido binario completo)
    @Override
    public String toString() {
        return "ArchivoAdjunto{" +
                "nombreArchivo='" + nombreArchivo + '\'' +
                ", contenido=" + (contenido != null ? contenido.length + " bytes" : "null") +
                ", tipoContenido='" + tipoContenido + '\'' +
                '}';
    }
}
