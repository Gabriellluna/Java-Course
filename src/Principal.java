import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Filme meuFilme = new Filme("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoGabriel = new Filme("Diário de um Banana 2");
        filmeDoGabriel.setDuracaoEmMinutos(100);
        filmeDoGabriel.avalia(10);
        filmeDoGabriel.setAnoDeLancamento(2010);
        filmeDoGabriel.setDiretor("Truta");

        List<Titulo> filmes = new ArrayList<>();
        filmes.add(filmeDoGabriel);
        filmes.add(meuFilme);
        filmes.add(outroFilme);
        filmes.add(lost);

        for(Titulo item: filmes){
            System.out.println("Item: " + item);
            if(item instanceof Filme filme) {
                System.out.println( filme.getClassificacao());
            }
        }

        Collections.sort(filmes);

        System.out.println("Depois de ordenar pelo ano de lançamento");

        for(Titulo item: filmes){
            System.out.println("Item: " + item);
            if(item instanceof Filme filme) {
                System.out.println( filme.getClassificacao());
            }
        }

        filmes.sort(Comparator.comparing(Titulo::getNome));

        System.out.println("Depois de ordenar pela ordem alfabética do nome");

        for(Titulo item: filmes){
            System.out.println("Item: " + item);
            if(item instanceof Filme filme) {
                System.out.println( filme.getClassificacao());
            }
        }


        System.out.println("Insira um filme que deseja saber mais sobre");
        String nome = scanner.nextLine().toLowerCase();


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://www.omdbapi.com/?t=%s&apikey=d6539f72", nome)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new Gson();

        Titulo titulo = gson.fromJson(response.body(), Titulo.class);

        System.out.println(titulo.toString());

    }
}