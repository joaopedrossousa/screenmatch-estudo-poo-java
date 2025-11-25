package br.com.alura.screenmatch.principal;

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
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=d690060";

        //design pattern para requisição;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        //design pattern para resposta;
        HttpResponse<String> response = client
                //.send eh uma exceção, trata-la;
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
