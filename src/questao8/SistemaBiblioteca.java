package src.questao8;

public class SistemaBiblioteca {
    public String registrarEmprestimo(MaterialBiblioteca material) {
        return "Empréstimo registrado: " + material.titulo + ". Prazo de devolução: " + material.prazoDevolucao + " dias.";
    }

    public double calcularMulta(MaterialBiblioteca material, int diasAtraso) {
        try {
            return material.calcularMulta(diasAtraso);
        } catch (AtrasoInvalidoException e) {
            System.err.println("Erro ao calcular multa: " + e.getMessage());
            return -1.0;
        }
    }
}