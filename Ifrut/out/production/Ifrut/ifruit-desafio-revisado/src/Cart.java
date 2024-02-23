public class Cart {
    private Double grossPrice;
    private Double tax;
    private Double totalPrice;
    private Product[] prodList;

    public Cart(Double tax, Product[] prodList) {
        this.tax = tax;
        this.prodList = prodList;

        this.totalPrice = 0.00;
        this.grossPrice = 0.00;
    }

    public Double getGrossPrice() {
        return this.totalPrice+this.tax;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPrice() {
        return showTotal();
    }


    public Product[] getProdList() {
        return prodList;
    }

    public void setProdList(Product[] prodList) {
        this.prodList = prodList;
    }

    public void checkout(){
        System.out.println("Compra finalizada!");
        this.prodList = null;
    }

    public Double showTotal(){
        if (this.prodList.length >= 1){
            for (Product product : this.prodList){
                this.totalPrice += product.getPrice();
            }
            return this.totalPrice;
        }else{
            return 0.00;
        }
    }

    public void listingProducts(){
        //Lista todos os produtos no carrinho
        if (this.prodList.length >= 1){
            //Para cada item do prodList estou criando um objeto product do tipo Prodcut
            for (Product product : this.prodList){
                System.out.println(
                        "Name: "+product.getName() + "| Weight: "+product.getWeigth() + "| Price: "+product.getPrice()
                );
            }
        }else{
            //Caso nao tenha produtos no carrinho
            System.out.println("No products to show!");
        }



    }
}
