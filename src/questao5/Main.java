package src.questao5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente("João", 1000);
        ContaPoupanca poupanca = new ContaPoupanca("Maria", 2000);
        ContaSalario salario = new ContaSalario("Carlos", 1500, 2);
        corrente.depositar(500);
        corrente.sacar(200);

        poupanca.depositar(300);
        poupanca.adicionarRendimento(0.5);

        salario.depositar(200);
        salario.sacar(100);
        salario.sacar(100);
        salario.sacar(100);
    }
}
