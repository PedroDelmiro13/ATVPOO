package src.questao6;

public class Main {
    public static void main (String [] args){
        MetodoPagamento cartao = new CartaoCredito(5.0);
        MetodoPagamento pix = new Pix(2.0);
        MetodoPagamento boleto = new Boleto(1.0);
        SistemaPagamento sistema = new SistemaPagamento();

        sistema.efetuarPagamento(cartao, 2000.0 );
        System.out.println(cartao.processarPagamento(2000.0));
        sistema.efetuarPagamento(boleto, 2000.0);
        sistema.efetuarPagamento(pix, 1000.0);

    }
}
