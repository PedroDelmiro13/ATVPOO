package src.questao6;

public class Pix extends MetodoPagamento{
    public Pix(double taxa){
        super(taxa);
    }
    @Override
    public boolean processarPagamento(double valor){
        if(valor < 0){
            throw new RuntimeException("Valor invalido");
        }
        setTaxa(0);
        return true;
    }
}
