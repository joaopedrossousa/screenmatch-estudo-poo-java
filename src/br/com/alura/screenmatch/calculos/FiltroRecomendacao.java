package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >=4){
            System.out.println("Está entre os favoritos do momento! ");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Bem avaliado...");
        }else {
            System.out.println("Adicione na sua lista para assistir depois...");
        }
    }




}
