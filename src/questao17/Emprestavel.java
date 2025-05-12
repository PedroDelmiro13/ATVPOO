package src.questao17;

public interface Emprestavel {
    boolean emprestar(Usuario usuario) throws MaterialIndisponivelException;
    boolean devolver(Usuario usuario);
}
