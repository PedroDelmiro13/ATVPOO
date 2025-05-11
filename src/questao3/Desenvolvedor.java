package src.questao3;

public class Desenvolvedor extends Funcionario{
    private double fatorDeProdutividade;
    public Desenvolvedor(String nome, double salarioBase, double fatorDeProdutividade){
        super(nome, salarioBase);
        this.fatorDeProdutividade = fatorDeProdutividade;
    }

    public double getFatorDeProdutividade() {
        return fatorDeProdutividade;
    }

    public void setFatorDeProdutividade(double fatorDeProdutividade) {
        this.fatorDeProdutividade = fatorDeProdutividade;
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase() * fatorDeProdutividade;
    }
}
