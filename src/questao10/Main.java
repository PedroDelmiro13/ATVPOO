package src.questao10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorDeProjeto gestor = new GestorDeProjeto();

        try {
            Desenvolvedor dev1 = new Desenvolvedor("Ricardo", "Alpha");
            Designer designer1 = new Designer("Mariana", "Beta");
            GerenteDeProjetos gerente1 = new GerenteDeProjetos("Carlos", "Alpha");

            gestor.adicionarMembro(dev1);
            gestor.adicionarMembro(designer1);
            gestor.adicionarMembro(gerente1);
            gestor.adicionarMembro(new Desenvolvedor("Ana", "Beta"));

            System.out.println(gestor.exibirRelatorio(dev1));
            System.out.println(gestor.exibirRelatorio(designer1));
            System.out.println(gestor.exibirRelatorio(gerente1));

            System.out.println("\nMembros do projeto Alpha:");
            List<MembroEquipe> equipeAlpha = gestor.listarEquipePorProjeto("Alpha");
            for (MembroEquipe membro : equipeAlpha) {
                System.out.println(membro.obterDetalhes());
            }

            System.out.println("\nMembros do projeto Beta:");
            List<MembroEquipe> equipeBeta = gestor.listarEquipePorProjeto("Beta");
            for (MembroEquipe membro : equipeBeta) {
                System.out.println(membro.obterDetalhes());
            }

            gestor.adicionarMembro(null);
        } catch (MembroInvalidoException e) {
            System.err.println("Erro ao adicionar membro: " + e.getMessage());
        }
    }
}
