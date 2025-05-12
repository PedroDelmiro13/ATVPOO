package src.questao17;

public class Revista extends Material {
    String edicao;

    public Revista(String titulo, String edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    @Override
    public String informarMaterial() {
        return "Revista: " + titulo + " (Edição: " + edicao + ")";
    }
}
