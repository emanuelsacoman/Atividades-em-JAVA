public class Aviao {
    public
    String modelo, fabricante;
    int qteA;

    public void ligar(){
        System.out.println("Ligando o avião "+fabricante+" - modelo "+modelo+".");
    }
    public void desligar(){
        System.out.println("Desligando o avião "+fabricante+".");
    }
}