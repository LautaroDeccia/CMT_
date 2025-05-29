public class Comentario {
    private int  id;
    private String texto;
    private LocalDateTime fecha;
    private String hora;
    private String autor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // constructor, getters y setters si querés
    public Comentario(String autor, String hora, String fecha, String texto, int id) {
        this.autor = autor;
        this.hora = hora;
        this.fecha = fecha;
        this.texto = texto;
        this.id = id;


    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

