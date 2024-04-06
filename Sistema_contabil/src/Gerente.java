import java.util.ArrayList;
import java.util.List;

public class Gerente extends Contador {
    private List<Contador> contadores;

    public Gerente(String cpf, String rg, String telefone, String senha) {
        super(cpf, rg, telefone, senha);
        contadores = new ArrayList<>();
    }

    public void adicionarContador(Contador contador) {
        contadores.add(contador);
        System.out.println("Contador adicionado com sucesso.");
    }

    public void removerContador(Contador contador) {
        contadores.remove(contador);
        System.out.println("Contador removido com sucesso.");
    }

    public void listarContadores() {
        System.out.println("Contadores sob sua gestão:");
        for (Contador contador : contadores) {
            System.out.println("CPF: " + contador.getCpf());
        }
    }

    public void verRelatoriosPorContador() {
        System.out.println("Relatórios criados por cada contador:");
        for (Contador contador : contadores) {
            System.out.println("CPF: " + contador.getCpf() + ", Relatórios: " + contador.getRelatoriosCriados());
        }
    }
}
