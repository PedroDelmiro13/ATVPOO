package src.questao19;

public class Teste extends Tarefa {
    public Teste(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Teste: " + descricao + " executado.";
    }
}
