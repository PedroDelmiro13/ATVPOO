package src.questao14;

public class Main {
    public static void main(String[] args) {
        SistemaRelatorios sistema = new SistemaRelatorios();
        String tituloRelatorio = "Relatório de Vendas Mensal";
        String conteudoRelatorio = "Produto,Quantidade,Preço\nCaneta,100,1.50\nLápis,200,0.75\nBorracha,50,1.00";

        ExportadorPDF pdfExporter = new ExportadorPDF();
        String resultadoPDF = sistema.exportarRelatorio(pdfExporter, tituloRelatorio, conteudoRelatorio);
        System.out.println(resultadoPDF);
        System.out.println("---");

        ExportadorCSV csvExporter = new ExportadorCSV();
        String resultadoCSV = sistema.exportarRelatorio(csvExporter, tituloRelatorio, conteudoRelatorio);
        System.out.println(resultadoCSV);
        System.out.println("---");

        ExportadorXML xmlExporter = new ExportadorXML();
        String resultadoXML = sistema.exportarRelatorio(xmlExporter, tituloRelatorio, conteudoRelatorio);
        System.out.println(resultadoXML);
    }
}
