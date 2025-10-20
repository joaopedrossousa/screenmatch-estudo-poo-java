public class Movie {
    String movieName;
    int releaseYear;
    boolean planIncluded;
    private double totalRating;
    private int countRating;
    int movieDuration;

    int getCountRating() {
        return countRating;
    }

    void showDataSheet(){
        System.out.println("Nome do filme: " +movieName);
        System.out.println("Ano de Lançamento: " +releaseYear);
        System.out.println("Duração do Filme: " +movieDuration+ " minutos.");
        System.out.println("Avaliação Média: %.1f".formatted(averageRating()));
        System.out.println("Total de avaliações: " + getCountRating());
    }

    void rate(double score){
        totalRating += score;
        countRating ++;
    }

    double averageRating(){
        return totalRating / countRating;
    }
}

