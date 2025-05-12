package src.questao17;

public class Livro extends Material {
    String autor;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public String informarMaterial() {
        return "Livro: " + titulo + " (Autor: " + autor + ")";
    }
}
