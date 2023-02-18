public class App {
    public static void main(String[] args) throws Exception {
        Aviao aviao1=new Aviao();
        aviao1.fabricante="Boeing";
        aviao1.modelo="777";
        aviao1.qteA=300;
        aviao1.ligar();
        aviao1.desligar();
    }
}