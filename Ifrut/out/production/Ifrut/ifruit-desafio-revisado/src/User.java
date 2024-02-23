public class User {
    private String name;
    private String email;
    private Integer age;
    private Cart cart;

    public User (String name, String email, Integer age, Cart cart){
        //Construtor da Classe
        this.name = name;
        this.email = email;
        this.age = age;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void pay(){
        System.out.println("Pagamento Feito!");
    }
}
