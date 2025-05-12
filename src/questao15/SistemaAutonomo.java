package src.questao15;

public class SistemaAutonomo {
    public String navegar(ControleAutonomo controle, String destino, double velocidade) {
        StringBuilder resultado = new StringBuilder();
        try {
            resultado.append(controle.iniciarRota(destino)).append("\n");
            resultado.append(controle.ajustarVelocidade(velocidade));
        } catch (DestinoInvalidoException e) {
            resultado.append("Erro ao iniciar rota: ").append(e.getMessage());
        } catch (VelocidadeInvalidaException e) {
            resultado.append("Erro ao ajustar velocidade: ").append(e.getMessage());
        }
        return resultado.toString();
    }
}
