package src.questao16;

public class Tempero extends Ingrediente {
    String intensidade;

    public Tempero(String nome, double quantidade, String intensidade) throws QuantidadeInvalidaException {
        super(nome, quantidade);
        this.intensidade = intensidade;
    }

    @Override
    public String informar() {
        return nome + " (quantidade: " + String.format("%.2f", quantidade) + ", intensidade: " + intensidade + ")";
    }
}
