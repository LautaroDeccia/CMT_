import java.time.LocalDate;

public class FlujoAtencion {
    private FuncionarioUsuario funcionario;
    private EstudianteUsuario estudiante;
    private SolicitudAsistencia solicitud;

    // Este método inicia el flujo: crea solicitud, asigna seguimiento y envía recordatorio
    public void iniciarFlujo(EstudianteUsuario estudiante, FuncionarioUsuario funcionario, String motivo, LocalDate fechaDeseada, String sede) {
        this.estudiante = estudiante;
        this.funcionario = funcionario;
        this.solicitud = estudiante.solicitarAsistencia(motivo, fechaDeseada, sede);
        funcionario.asignarSeguimiento(estudiante, solicitud);
        Recordatorio recordatorio = new Recordatorio(funcionario, solicitud);
        recordatorio.enviar();
    }

    // Getters opcionales si se quiere acceder al estado guardado
    public FuncionarioUsuario getFuncionario() {
        return funcionario;
    }

    public EstudianteUsuario getEstudiante() {
        return estudiante;
    }

    public SolicitudAsistencia getSolicitud() {
        return solicitud;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "FlujoAtencion{" +
                "funcionario=" + funcionario +
                ", estudiante=" + estudiante +
                ", solicitud=" + solicitud +
                '}';
    }
}