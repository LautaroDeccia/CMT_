// CLASE AGENDA PERSONAL
// Guarda los recordatorios asociados a un funcionario, útil para que el funcionario gestione su tiempo.
import java.util.ArrayList;
import java.util.List;

public class AgendaPersonal {
    private FuncionarioUsuario funcionario;
    private List<Recordatorio> recordatorios;

    // Constructor necesario porque esta clase guarda estado interno (funcionario y sus recordatorios)
    public AgendaPersonal(FuncionarioUsuario funcionario) {
        this.funcionario = funcionario;
        this.recordatorios = new ArrayList<>();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.recordatorios.add(recordatorio);
    }

    public List<Recordatorio> getRecordatorios() {
        return recordatorios;
    }

    public FuncionarioUsuario getFuncionario() {
        return funcionario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgendaPersonal del funcionario: ").append(funcionario).append("\n");
        sb.append("Recordatorios:\n");
        for (Recordatorio r : recordatorios) {
            sb.append("- ").append(r).append("\n");
        }
        return sb.toString();
    }


}