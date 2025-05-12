package src.questao10;

import java.util.ArrayList;
import java.util.List;

class GestorDeProjeto {
    private List<MembroEquipe> equipe = new ArrayList<>();

    public void adicionarMembro(MembroEquipe membro) throws MembroInvalidoException {
        if (membro == null) {
            throw new MembroInvalidoException("Erro: Não é possível adicionar um membro de equipe nulo.");
        }
        equipe.add(membro);
    }

    public String exibirRelatorio(MembroEquipe membro) {
        return membro.obterDetalhes() + ", Tarefa atual: " + membro.trabalhar();
    }

    public List<MembroEquipe> listarEquipePorProjeto(String projeto) {
        List<MembroEquipe> membrosDoProjeto = new ArrayList<>();
        for (MembroEquipe membro : equipe) {
            if (membro.projeto.equals(projeto)) {
                membrosDoProjeto.add(membro);
            }
        }
        return membrosDoProjeto;
    }
}