package src.questao15;

public interface ControleAutonomo {
    String iniciarRota(String destino) throws DestinoInvalidoException;
    String ajustarVelocidade(double velocidade) throws VelocidadeInvalidaException;
}
