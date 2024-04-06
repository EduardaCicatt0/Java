public class Main {
    public static void main(String[] args) {
        SistemaContabilidade sistema = new SistemaContabilidade();
        sistema.registrarGerente("111111111", "222222222", "333333333", "senha123");
        sistema.registrarContador("222222222", "333333333", "444444444", "senha456");
        sistema.registrarContador("333333333", "444444444", "555555555", "senha789");
        sistema.login("111111111", "senha123");
    }
}
