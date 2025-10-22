package br.com.alura.screenmatch.models;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private  int episodiosPorTemporada;
    private  int minutosPorEpisódio;

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisódio() {
        return minutosPorEpisódio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisódio(int minutosPorEpisódio) {
        this.minutosPorEpisódio = minutosPorEpisódio;
    }

    //Sobreescreve um Atributo da Classe Mãe
    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisódio;
    }



}
