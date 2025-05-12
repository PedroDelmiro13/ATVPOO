package src.questao14;

public class SistemaRelatorios {
    public String exportarRelatorio(ExportadorRelatorio exportador, String titulo, String conteudo) {
        try {
            return exportador.exportar(titulo, conteudo);
        } catch (ExportacaoFalhouException e) {
            System.err.println("Erro ao exportar relatório: " + e.getMessage());
            return "Falha ao exportar relatório '" + titulo + "'.";
        }
    }
}