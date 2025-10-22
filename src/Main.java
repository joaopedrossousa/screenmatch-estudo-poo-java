import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {

    public static void main(String[] args) {
        Movie favorito = new Movie();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.setDiretor("Stiven Spilberg");

        favorito.exibeFichaTecnica();
        System.out.println("Diretor: "+ favorito.getDiretor());
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: %.1f ".formatted(favorito.pegaMedia()));

        System.out.println("------------------------------------");

        Serie breakinBad = new Serie();

        breakinBad.setNome("Breaking Bad");
        breakinBad.setAnoDeLancamento(2007);
        breakinBad.exibeFichaTecnica();
        breakinBad.setTemporadas(3);
        breakinBad.setEpisodiosPorTemporada(10);
        breakinBad.setMinutosPorEpisódio(30);
        System.out.println("Duração total em minutos da serie: " + breakinBad.getDuracaoEmMinutos() + " minutos");





    }

}
