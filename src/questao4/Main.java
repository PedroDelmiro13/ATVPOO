package src.questao4;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto smartphone = new Smartphone("Smartphone", 2500.00);
        Produto tablet = new Tablet("Tablet", 1800.00);
        Produto pc = new Computador("Computador", 4500.00);

        loja.adicionarProduto(smartphone);
        loja.adicionarProduto(tablet);
        loja.adicionarProduto(pc);

        System.out.println("Garantias dos produtos na loja:");
        loja.listarGarantias();
    }
}

