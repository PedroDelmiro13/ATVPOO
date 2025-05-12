package src.questao12;

public interface EstrategiaDesconto {
    double calcularDesconto(double preco) throws PrecoInvalidoException;
}
