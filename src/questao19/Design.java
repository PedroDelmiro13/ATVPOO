package src.questao19;

public class Design extends Tarefa {
    public Design(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Design: " + descricao + " finalizado.";
    }
}
