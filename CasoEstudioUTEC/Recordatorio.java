public class Recordatorios {
//Atributos
    private int id;
    private String estudiante;
    private String correoElectronico;
    private String asunto;
    private String mensaje;
    private LocalDateTime fechaHoraReunion;
    private boolean enviado;
//Constructor Principal


    public Recordatorios(int id, boolean enviado, LocalDateTime fechaHoraReunion, String mensaje, String asunto, String correoElectronico, String estudiante) {
        this.id = id;
        this.enviado = enviado;
        this.fechaHoraReunion = fechaHoraReunion;
        this.mensaje = mensaje;
        this.asunto = asunto;
        this.correoElectronico = correoElectronico;
        this.estudiante = estudiante;
    }
//Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFechaHoraReunion() {
        return fechaHoraReunion;
    }

    public void setFechaHoraReunion(LocalDateTime fechaHoraReunion) {
        this.fechaHoraReunion = fechaHoraReunion;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
// Método toString()

    @Override
    public String toString() {
        return "Recordatorios{" +
                "id=" + id +
                ", estudiante='" + estudiante + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", asunto='" + asunto + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", fechaHoraReunion=" + fechaHoraReunion +
                ", enviado=" + enviado +
                '}';
    }
}
