package src.questao2;

public class Main {
    public static void main(String []args){
        Veiculo carro = new Carro("Honda", "Civic", 13, 4);
        Veiculo moto = new Moto("Fatboy", "Harley-Davidson", 13, "Bonito");

        moto.informacoes();
        carro.informacoes();
    }
}
