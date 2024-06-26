package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //adicionar
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
   
}
