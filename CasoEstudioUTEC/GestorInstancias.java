public class GestorInstancias {

    public InstanciaSeguimiento agendar(EstudianteUsuario estudiante, FuncionarioUsuario funcionario, LocalDate fecha, boolean esVirtual) {
        InstanciaSeguimiento instancia = new InstanciaSeguimiento(estudiante, funcionario, fecha, esVirtual);
        estudiante.agregarInstancia(instancia);
        funcionario.vincularEstudiante(estudiante);
        instancia.sincronizarConGoogleCalendar();
        RegistroAuditoria.registrar(funcionario.getId(), "Agendada instancia para " + estudiante.getNombre());
        return instancia;
    }

    public void reagendar(InstanciaSeguimiento instancia, LocalDate nuevaFecha, String motivo, Usuario solicitante) {
        instancia.setFecha(nuevaFecha);
        RegistroAuditoria.registrar(solicitante.getId(), "Reagendada instancia. Motivo: " + motivo);
    }

    public void cancelar(InstanciaSeguimiento instancia, String motivo, Usuario solicitante) {
        instancia.cancelar(motivo);
        RegistroAuditoria.registrar(solicitante.getId(), "Cancelada instancia. Motivo: " + motivo);
    }

    @Override
    public String toString() {
        return "GestorInstancias{}";
    }
}

