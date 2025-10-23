import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {

    /*
    Teste













     */

    public static void main(String[] args) {
        Movie meuFilme = new Movie();

        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDiretor("Stiven Spilberg");

        meuFilme.exibeFichaTecnica();
        System.out.println("Diretor: "+ meuFilme.getDiretor());
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Média de avaliações do filme: %.1f ".formatted(meuFilme.pegaMedia()));

        System.out.println("------------------------------------");

        Serie breakinBad = new Serie();

        breakinBad.setNome("Breaking Bad");
        breakinBad.setAnoDeLancamento(2007);
        breakinBad.exibeFichaTecnica();
        breakinBad.setTemporadas(3);
        breakinBad.setEpisodiosPorTemporada(10);
        breakinBad.setMinutosPorEpisódio(30);
        System.out.println("Duração total em minutos da serie: " + breakinBad.getDuracaoEmMinutos() + " minutos");
        System.out.println("------------------------------------");

        //Novo Filme
        Movie outroFilme = new Movie();
        outroFilme.setNome("Lord Of Rings");
        outroFilme.setAnoDeLancamento(2001);
        outroFilme.setDuracaoEmMinutos(230);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDiretor("R. R. Tolkien");

        outroFilme.exibeFichaTecnica();
        System.out.println("Diretor: "+ outroFilme.getDiretor());
        outroFilme.avalia(4);
        outroFilme.avalia(3);
        outroFilme.avalia(7);

        System.out.println("Média de avaliações do filme: %.1f ".formatted(outroFilme.pegaMedia()));

        System.out.println("------------------------------------");

        //Nova Pacote / Classe
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        //Metodo que incrementa o tempo de duração dos filmes.
        //Objeto da classe Calculadora.metodo(Objeto da Classe Mãe)
        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(breakinBad);
        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        System.out.println("------------------------------------");

    }

}
