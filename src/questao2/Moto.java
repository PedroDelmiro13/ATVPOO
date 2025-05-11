package src.questao2;

import src.questao1.Animal;

public class Moto extends Veiculo {
    private String tipoDeGuidao;
    public Moto(String modelo, String marca, int ano, String tipoDeGuidao){
        super(modelo, marca, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }
    @Override
    public void informacoes(){
        System.out.println("Marca: "+ getMarca()+"\nModelo: "+ getModelo() +"\nAno: " + getAno()+ "\nTipo de Guidão: "+ tipoDeGuidao);
    }
}
