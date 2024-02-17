public class User {
    public String name;
    public String email;
    public Integer idade; /* Double recebe números com pontos*/
    public Carrinho carrinho;

    public void pagar(){
    }
    public void setNome (String nome) {
        this.name = nome;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    public void setIdade (int idade) {
        this.idade = idade;

    }
    public void setCarrinho (Carrinho carrinho) {
        this.carrinho = carrinho;

    }






}
