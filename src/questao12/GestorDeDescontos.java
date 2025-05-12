package src.questao12;

public class GestorDeDescontos {
        public double aplicarDesconto(EstrategiaDesconto estrategia, double preco) {
            try {
                double desconto = estrategia.calcularDesconto(preco);
                return preco - desconto;
            } catch (PrecoInvalidoException e) {
                System.err.println("Erro ao aplicar desconto: " + e.getMessage());
                return preco;
            }
        }
}
