package src.questao20;

public interface Reservavel {
    boolean reservar(String data, Rota rota) throws RotaInvalidaException;
}
