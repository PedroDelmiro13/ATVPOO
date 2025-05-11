package src.questao5;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }
    public void adicionarRendimento(){
        double novoSaldo = getSaldo() * (5.0/100.0);
        setSaldo(novoSaldo);
    }
}
