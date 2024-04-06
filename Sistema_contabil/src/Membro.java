public class Membro {
    private String cpf;
    private String rg;
    private String telefone;
    private String senha;

    public Membro(String cpf, String rg, String telefone, String senha) {
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
}
