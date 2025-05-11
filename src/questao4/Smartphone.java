package src.questao4;

public class Smartphone extends Produto {
    public Smartphone(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularGarantia() {
        return 2.0;
    }
}
