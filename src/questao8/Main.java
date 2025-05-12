package src.questao8;

public class Main {

    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        Livro livro = new Livro("Dom Quixote", 30);
        System.out.println(sistema.registrarEmprestimo(livro));
        System.out.println("Multa por 5 dias de atraso (Livro): R$" + String.format("%.2f", sistema.calcularMulta(livro, 5)));
        System.out.println("Multa por -2 dias de atraso (Livro): R$" + String.format("%.2f", sistema.calcularMulta(livro, -2)));

        Revista revista = new Revista("National Geographic", 7);
        System.out.println(sistema.registrarEmprestimo(revista));
        System.out.println("Multa por 3 dias de atraso (Revista): R$" + String.format("%.2f", sistema.calcularMulta(revista, 3)));

        DVD dvd = new DVD("O Poderoso Chefão", 5);
        System.out.println(sistema.registrarEmprestimo(dvd));
        System.out.println("Multa por 7 dias de atraso (DVD): R$" + String.format("%.2f", sistema.calcularMulta(dvd, 7)));
    }
}
