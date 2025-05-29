import java.util.List;

public class FuncionarioUsuario extends Usuario {
    private String cargo; // Ejemplo: Psicopedagogo, Docente, Administrador
    private List<SesionUsuario> sesionesActivas; // Lista de sesiones activas
    private List<RegistroAuditoria> accionesAuditoria; // Acciones de auditoría

    // Constructor
    public FuncionarioUsuario(int id, String nombre, String apellido, String numeroTelefono, String correoElectronico, String contrasena, String sede, Rol rol,
                              String cargo, List<SesionUsuario> sesionesActivas, List<RegistroAuditoria> accionesAuditoria) {
        super(id, nombre, apellido, numeroTelefono, correoElectronico, contrasena, sede, rol);
        this.cargo = cargo;
        this.sesionesActivas = sesionesActivas;
        this.accionesAuditoria = accionesAuditoria;
    }

    // Getters y Setters específicos para funcionarios
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public List<SesionUsuario> getSesionesActivas() { return sesionesActivas; }
    public void setSesionesActivas(List<SesionUsuario> sesionesActivas) { this.sesionesActivas = sesionesActivas; }

    public List<RegistroAuditoria> getAccionesAuditoria() { return accionesAuditoria; }
    public void setAccionesAuditoria(List<RegistroAuditoria> accionesAuditoria) { this.accionesAuditoria = accionesAuditoria; }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", FuncionarioUsuario{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
