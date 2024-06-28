package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList;

    public CatalagoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l:livroList  ) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l:livroList  ) {
                if (l.getTitulo().equalsIgnoreCase(titulo) ) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivros("Livro 1 ", "Autor 1 : ", 2020);
        catalagoLivros.adicionarLivros("Livro 2 ", "Autor 2 : ", 2021);
        catalagoLivros.adicionarLivros("Livro 3 ", "Autor 3 : ", 2022);
        catalagoLivros.adicionarLivros("Livro 4 ", "Autor 4 : ", 2023);
        catalagoLivros.adicionarLivros("Livro 5 ", "Autor 5 : ", 2024);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));


    }
}
