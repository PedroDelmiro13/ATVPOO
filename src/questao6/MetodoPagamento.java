package src.questao6;

public abstract class MetodoPagamento {
    private double taxa;
    public MetodoPagamento(double taxa){
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public abstract boolean processarPagamento(double valor);
    public double calcularTaxa(double valor){
        return valor * taxa;
    }
}
