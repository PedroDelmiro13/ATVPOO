package src.questao6;

public class CartaoCredito extends MetodoPagamento{
    public CartaoCredito(double taxa){
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor){
        if (valor < 0){
            throw new RuntimeException("Valor inválido");
        }
        if(getTaxa() < 0.02){
            return true;
        }else{
            return false;
        }
    }
}
