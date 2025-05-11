package src.questao5;

public class Conta {
    private String titular;
    private double saldo;
    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor){
        if(valor > saldo || valor <= 0){
            throw new RuntimeException("Valor inválido");
        }
        saldo -= valor;
    }public void depositar(double valor){
        if(valor < 0){
            throw new RuntimeException("Valor inválido");
        }
        saldo += valor;
    }
}
