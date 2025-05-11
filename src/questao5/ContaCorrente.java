package src.questao5;

public class ContaCorrente extends Conta{
    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }
    @Override
    public void sacar(double valor){
        if(valor > getSaldo() || valor <= 0){
            throw new RuntimeException("Valor inválido");
        }
        double novoValor = getSaldo() - (valor * 0.5);
        setSaldo(novoValor);
    }
}
