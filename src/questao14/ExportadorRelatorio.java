package src.questao14;

public interface ExportadorRelatorio {
    String exportar(String titulo, String conteudo) throws ExportacaoFalhouException;
}
