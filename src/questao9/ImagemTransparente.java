package src.questao9;

public class ImagemTransparente extends Imagem {
    public ImagemTransparente(int largura, int altura) throws DimensaoInvalidaException {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Imagem transparente processada: máscara de transparência aplicada.";
    }
}
