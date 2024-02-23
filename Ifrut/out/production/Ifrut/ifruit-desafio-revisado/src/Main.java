public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product("Banana", true, 0.5, 10.00);
        products[1] = new Product("Letuce", false, 0.2, 3.00);
        products[2] = new Product("Tomato", false, 0.5, 4.00);

        Cart cart = new Cart(0.1,products);

        User cliente = new User("Matheus","matheus@email.com",25, cart);

        System.out.println("Cliente: "+cliente.getName());

        cliente.getCart().listingProducts();
        System.out.println("Total a pagar: "+cliente.getCart().getTotalPrice());

        cliente.getCart().checkout();
        cliente.pay();

    }
}