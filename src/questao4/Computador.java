package src.questao4;

public class Computador extends Produto {
    public Computador(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularGarantia() {
        return 3.0;
    }
}
