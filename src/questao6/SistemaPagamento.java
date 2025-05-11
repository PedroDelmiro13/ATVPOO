package src.questao6;

public class SistemaPagamento {
    public SistemaPagamento(){}
    public boolean efetuarPagamento(MetodoPagamento metodo, double valor){
        if(valor < 0){
            throw new RuntimeException("Valor invalido");
        }

        metodo.processarPagamento(valor);
        metodo.getTaxa();
        return true;
    }
}
