import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaContabilidade {
    private List<Membro> membros;
    private Gerente gerente;
    private Scanner scanner;

    public SistemaContabilidade() {
        membros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void registrarMembro(String cpf, String rg, String telefone, String senha) {
        Membro membro = new Membro(cpf, rg, telefone, senha);
        membros.add(membro);
    }

    public void registrarContador(String cpf, String rg, String telefone, String senha) {
        Contador contador = new Contador(cpf, rg, telefone, senha);
        membros.add(contador);
        if (gerente != null) {
            gerente.adicionarContador(contador);
        }
    }

    public void registrarGerente(String cpf, String rg, String telefone, String senha) {
        gerente = new Gerente(cpf, rg, telefone, senha);
        membros.add(gerente);
    }

    public void login(String cpf, String senha) {
        for (Membro membro : membros) {
            if (membro.getCpf().equals(cpf) && membro.validarSenha(senha)) {
                if (membro instanceof Contador) {
                    menuContador((Contador) membro);
                } else if (membro instanceof Gerente) {
                    menuGerente((Gerente) membro);
                } else {
                    menuMembro(membro);
                }
                return;
            }
        }
        System.out.println("CPF ou senha incorretos.");
    }

    private void menuMembro(Membro membro) {
        System.out.println("Bem-vindo, Membro!");
        // Implemente as opções do menu para o membro
        System.out.println("1. Visualizar informações pessoais");
        System.out.println("2. Sair");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("CPF: " + membro.getCpf());
                System.out.println("RG: " + membro.getRg());
                System.out.println("Telefone: " + membro.getTelefone());
                break;
            case 2:
                return;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private void menuContador(Contador contador) {
        System.out.println("Bem-vindo, Contador!");
        while (true) {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1. Criar Imposto de Renda");
            System.out.println("2. Criar Histórico de Gastos");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    contador.criarImpostoDeRenda();
                    break;
                case 2:
                    contador.criarHistoricoDeGastos();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private void menuGerente(Gerente gerente) {
        System.out.println("Bem-vindo, Gerente!");
        while (true) {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1. Adicionar Contador");
            System.out.println("2. Remover Contador");
            System.out.println("3. Listar Contadores");
            System.out.println("4. Ver Relatórios por Contador");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // Lógica para adicionar contador
                    System.out.print("Digite o CPF do contador a ser adicionado: ");
                    String cpfAdicionar = scanner.next();
                    System.out.print("Digite o RG do contador: ");
                    String rgAdicionar = scanner.next();
                    System.out.print("Digite o telefone do contador: ");
                    String telefoneAdicionar = scanner.next();
                    System.out.print("Digite a senha do contador: ");
                    String senhaAdicionar = scanner.next();
                    registrarContador(cpfAdicionar, rgAdicionar, telefoneAdicionar, senhaAdicionar);
                    break;
                case 2:
                    // Lógica para remover contador
                    System.out.print("Digite o CPF do contador a ser removido: ");
                    String cpfRemover = scanner.next();
                    for (Membro membro : membros) {
                        if (membro instanceof Contador && membro.getCpf().equals(cpfRemover)) {
                            gerente.removerContador((Contador) membro);
                            break;
                        }
                    }
                    break;
                case 3:
                    gerente.listarContadores();
                    break;
                case 4:
                    gerente.verRelatoriosPorContador();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
