public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.movieName = "Lord of Rings: The Fellowship of The Ring";
        firstMovie.releaseYear = 2001;
        firstMovie.movieDuration = 360;

        firstMovie.showDataSheet();
        firstMovie.rate(8);
        firstMovie.rate(5);
        firstMovie.rate(10);

        System.out.println(firstMovie.totalRating);
        System.out.println(firstMovie.countRating);
        System.out.println(firstMovie.averageRating());

    }
}
