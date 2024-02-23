public class Product {
    private String name;
    private Boolean discount;
    private Double weigth;
    private Double price;

    public Product(String name, Boolean discount, Double weigth, Double price) {
        //Construtor da Classe
        this.name = name;
        this.discount = discount;
        this.weigth = weigth;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public Double getWeigth() {
        return weigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public Double getPrice() {
        return calcDiscount();
    }


    public Double calcDiscount(){
        //Aplica 20% de desconto
        return this.discount ? this.price*0.80  : this.price;
    }
}
