package src.questao20;

public class Onibus extends Veiculo {
    private static final double VELOCIDADE_MEDIA = 60.0;

    public Onibus(String modelo, int capacidade) throws CapacidadeInvalidaException {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE_MEDIA;
    }
}
