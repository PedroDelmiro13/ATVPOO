package src.questao19;

public abstract class Tarefa {
    String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public abstract String realizarTarefa();
}
