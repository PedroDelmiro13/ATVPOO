package src.questao3;

public class Main {
    public static void main (String []args){
        Funcionario gerente = new Gerente("João Silva", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Maria Souza", 4000, 1.2);
        Funcionario estagiario = new Estagiario("Carlos Oliveira", 1500);

        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(estagiario);

        empresa.calcularFolhaPagamento();

        Funcionario outroGerente = new Gerente("Ana Costa", 6000);
        empresa.adicionarFuncionario(outroGerente);

        System.out.println("\nApós adicionar novo gerente:");
        empresa.calcularFolhaPagamento();
    }
}

