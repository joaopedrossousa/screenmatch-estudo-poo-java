package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        //definindo uma busca
        System.out.println("Informe um Filme para Realizar uma Consulta: ");
        var busca = leitura.nextLine();
        //concatenando
        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d690060";

        try{
            //design pattern para requisição;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            //design pattern para resposta;
            HttpResponse<String> response = client
                    //.send eh uma exceção, trata-la;
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //tratando JSON
            //recebendo JSON em um var String
            String json = response.body();
            System.out.println(json);
            //criando um objeto com gson
            /*
             * gson builder com os parametros para converter a primeira letra da chave do json para maiusculo
             * uso situacional
             * */
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            //convertendo JSON para string
            TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
            System.out.println(meuTituloOMDB);

            //atribuindo a chave do json a classe
            System.out.println();

            // try{
            Titulo meuTitulo = new Titulo(meuTituloOMDB);
            System.out.println("Titulo Convertido: ");
            System.out.println(meuTitulo);

        } catch (NumberFormatException e){
            System.out.println("Ocorreu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Erro na URL de busca da API, verifique o endereço...");
            System.out.println(e.getMessage());
        }

        System.out.println("Programa Executado Normalmente...");
    }
}
