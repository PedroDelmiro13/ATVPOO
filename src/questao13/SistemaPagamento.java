package src.questao13;

public class SistemaPagamento {
    public boolean realizarPagamento(ProcessadorPagamento processador, double valor) {
        try {
            if (processador.autorizarPagamento(valor)) {
                return processador.processarPagamento(valor);
            } else {
                System.out.println("Pagamento não autorizado pelo processador.");
                return false;
            }
        } catch (ValorInvalidoException e) {
            System.err.println("Erro ao realizar pagamento: " + e.getMessage());
            return false;
        } catch (PagamentoNaoAutorizadoException e) {
            System.err.println("Erro ao realizar pagamento: " + e.getMessage());
            return false;
        }
    }


}
