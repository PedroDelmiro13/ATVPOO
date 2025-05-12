package src.questao19;

public class Desenvolvimento extends Tarefa {
    public Desenvolvimento(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Desenvolvimento: " + descricao + " concluído.";
    }
}