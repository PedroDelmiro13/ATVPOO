package src.questao3;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase() + 50.00;
    }
}
