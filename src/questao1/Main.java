package src.questao1;

public class Main {
    public static void main (String [] args){
        Zoologico zoo = new Zoologico();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        zoo.zoo();
        cachorro.som();
        gato.som();
    }
}
