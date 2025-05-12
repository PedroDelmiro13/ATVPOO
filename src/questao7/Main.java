package src.questao7;

public class Main {
    public static void main(String[] args) {
        GestorDeTransporte gestor = new GestorDeTransporte();

        Carro carro = new Carro(5, 180.0);
        String infoCarro = gestor.calcularViagem(carro, 360.0);
        System.out.println("Carro: " + infoCarro);

        Aviao aviao = new Aviao(200, 800.0);
        String infoAviao = gestor.calcularViagem(aviao, 1600.0);
        System.out.println("Avião: " + infoAviao);

        Navio navio = new Navio(500, 50.0);
        String infoNavio = gestor.calcularViagem(navio, 100.0);
        System.out.println("Navio: " + infoNavio);

        Carro carroLento = new Carro(4, 0.0);
        String infoCarroLento = gestor.calcularViagem(carroLento, 100.0);
        System.out.println("Carro Lento: " + infoCarroLento);
    }
}
