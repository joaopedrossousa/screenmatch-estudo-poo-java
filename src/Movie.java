public class Movie {
    String movieName;
    int releaseYear;
    boolean planIncluded;
    double totalRating;
    int countRating;
    int movieDuration;

    void showDataSheet(){
        System.out.println("Nome do filme: " +movieName);
        System.out.println("Ano de Lançamento: " +releaseYear);
        System.out.println("Duração do Filme: " +movieDuration+ " minutos.");
        System.out.println("Avaliação Média: %.1f".formatted(averageRating()));
    }

    void rate(double score){
        totalRating += score;
        countRating ++;
    }

    double averageRating(){
        return totalRating / countRating;
    }
}

