package src.questao2;

public class Carro extends Veiculo{
    private int numeroDePortas;
    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    @Override
    public void informacoes(){
        System.out.println("Marca: "+ getMarca()+"\nModelo: "+ getModelo() +"\nAno: " + getAno()+ "\nNúmero de Portas: "+ numeroDePortas);
    }
}
