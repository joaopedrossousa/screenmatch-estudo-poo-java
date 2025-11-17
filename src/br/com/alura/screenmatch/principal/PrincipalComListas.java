package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("0 poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(6);
        var filmeLancamento = new Filme("Dracula",2026);
        meuFilme.avalia(10);
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
        //Outra forma de utilizar o foreach
        lista.forEach(item -> System.out.println(item.getNome()));


    }
}
