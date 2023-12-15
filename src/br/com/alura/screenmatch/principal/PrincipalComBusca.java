package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.model.TituloOmdb;
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme p/ busca: ");
        var busca = scanner.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=2a58e946";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        System.out.println(json);

        // definir o retorno do json com letra minusculas
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class );
        System.out.println(meuTituloOmdb);

        // Titulo convertido para receber valores do Omdb e passando como parametro para o construtor
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("--------------------------------------------------------");
        System.out.println(meuTitulo);


    }

}
