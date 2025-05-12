package src.questao9;

public class EditorImagem {
    public String exibirInformacoes(Imagem imagem) {
        return "Largura: " + imagem.largura + " pixels, Altura: " + imagem.altura + " pixels. Processamento: " + imagem.processar();
    }

    public Imagem ajustarImagem(Imagem imagem, int novaLargura, int novaAltura) {
        try {
            if (imagem instanceof ImagemColorida) {
                return new ImagemColorida(novaLargura, novaAltura);
            } else if (imagem instanceof ImagemPretoBranco) {
                return new ImagemPretoBranco(novaLargura, novaAltura);
            } else if (imagem instanceof ImagemTransparente) {
                return new ImagemTransparente(novaLargura, novaAltura);
            }
        } catch (DimensaoInvalidaException e) {
            System.err.println("Erro ao ajustar imagem: " + e.getMessage());
            return null;
        }
        return null;
    }
}
