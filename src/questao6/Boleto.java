package src.questao6;

public class Boleto extends MetodoPagamento {
    public Boleto(double taxa){
        super(taxa);
    }
    @Override
    public boolean processarPagamento(double valor){
        setTaxa(0.05);
        if(valor < 0){
            throw new RuntimeException("Valor invalido");
        }
        return true;
    }

}
