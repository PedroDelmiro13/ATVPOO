package src.questao7;

public class GestorDeTransporte {
    public String calcularViagem(Veiculo veiculo, double distancia) {
        try {
            double tempo = veiculo.calcularTempo(distancia);
            String combustivel = veiculo.tipoDeCombustivel();
            return "Tempo de viagem: " + String.format("%.2f", tempo) + " horas. Tipo de combustível: " + combustivel + ".";
        } catch (VelocidadeInvalidaException e) {
            return "Erro ao calcular viagem: " + e.getMessage() + " Tipo de combustível: " + veiculo.tipoDeCombustivel() + ".";
        }
    }
}