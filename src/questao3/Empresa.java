package src.questao3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> listaDeFuncionarios = new ArrayList();
    public Empresa(){
    }
    public void calcularFolhaPagamento(){
        for(int i = 0; i < listaDeFuncionarios.size(); i++){
            System.out.println(listaDeFuncionarios.get(i).calcularSalario());
        }
    }
    public void adicionarFuncionario(Funcionario funcionario){
        listaDeFuncionarios.add(funcionario);
    }
}
