package src.questao13;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        ProcessadorCartao cartao = new ProcessadorCartao();
        sistema.realizarPagamento(cartao, 50.0);
        System.out.println("---");
        sistema.realizarPagamento(cartao, -10.0);
        System.out.println("---");

        ProcessadorPix pix = new ProcessadorPix();
        sistema.realizarPagamento(pix, 75.0);
        System.out.println("---");
        sistema.realizarPagamento(pix, 0.0);
        System.out.println("---");

        ProcessadorBoleto boleto = new ProcessadorBoleto();
        sistema.realizarPagamento(boleto, 5.0);
        System.out.println("---");
        sistema.realizarPagamento(boleto, 20.0);
    }
}
