package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    /*
    Evitar repetição

    //Classe Filme
    public void inclui(Movie m){
        this.tempoTotal += m.getDuracaoEmMinutos();
    }
    //Classe Serie
    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }

     */

    //Metodo que recebe o tempo com o get e incrementa no atributo tempoTotal
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " +titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
