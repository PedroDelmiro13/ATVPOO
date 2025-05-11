package src.questao6;

public class Main {
    public static void main (String [] args){
        MetodoPagamento cartao = new CartaoCredito(5.0);
        MetodoPagamento pix = new Pix(2.0);
    }
}
