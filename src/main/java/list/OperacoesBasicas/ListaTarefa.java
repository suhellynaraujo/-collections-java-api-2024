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

    //remover
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // retornar a descrição de todas as tarefas
    public int obterNumeroTotalTarfas(){

        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){

        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa =  new ListaTarefa();
        System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarfas());

        listaTarefa.adicionarTarefa( "Tarefa 1: ");
        listaTarefa.adicionarTarefa( "Tarefa 2: ");
        listaTarefa.adicionarTarefa( "Tarefa 3: ");
        System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarfas());

        listaTarefa.removerTarefa("Tarefa 2: ");
        System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarfas());

        listaTarefa.obterDescricoesTarefas();
    }
}
