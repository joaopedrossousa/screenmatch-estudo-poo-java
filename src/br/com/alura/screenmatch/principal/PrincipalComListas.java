package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeLancamento = new Filme("Dracula",2026);
        filmeLancamento.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        //Criação de um arraylist para os filmes
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeLancamento);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }
        System.out.println();
        /*
        //Outra forma de utilizar o foreach
        lista.forEach(item -> System.out.println(item.getNome()));

         */
        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("João");
        System.out.println("Lista não ordenada: ");
        System.out.println(buscaPorArtista);
        System.out.println();

        //Como ordenar uma lista
        Collections.sort(buscaPorArtista);
        System.out.println("Lista Ordenada: ");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);



    }
}
