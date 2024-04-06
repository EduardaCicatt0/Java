import java.util.ArrayList;
import java.util.List;

public class Contador extends Membro {
    private int relatoriosCriados;

    public Contador(String cpf, String rg, String telefone, String senha) {
        super(cpf, rg, telefone, senha);
        this.relatoriosCriados = 0;
    }

    public void criarImpostoDeRenda() {
        // Lógica para criar imposto de renda
        System.out.println("Imposto de Renda criado para o CPF: " + getCpf());
        relatoriosCriados++;
    }

    public void criarHistoricoDeGastos() {
        // Lógica para criar histórico de gastos
        System.out.println("Histórico de Gastos criado para o CPF: " + getCpf());
        relatoriosCriados++;
    }

    public int getRelatoriosCriados() {
        return relatoriosCriados;
    }
}
