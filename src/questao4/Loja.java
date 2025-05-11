package src.questao4;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> listaDeProduto = new ArrayList();
    public void listarGarantias(){
        for(int i = 0; i< listaDeProduto.size(); i++){
            System.out.println(listaDeProduto.get(i).calcularGarantia());
        }
    }
    public void adicionarProduto(Produto produto){
        listaDeProduto.add(produto);
    }
}
