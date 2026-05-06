import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{

     public static void main(String[] args) {
         //STREAMS API
         //OPERAÇÕES INTERMEDIÁRIAS
         //OPERAÇÕES TERMINAIS

         //filter, map (intermediárias) - reduce, collect (terminais)
         //filter retorna os dados de uma lista, map altera os dados de uma lista, depois dessas operações, damos um collect para gerar uma nova lista


         LocalDate date = LocalDate.of(2000,05,24);
         List<Livro> livros = new ArrayList<>();

         DateTimeFormatter format =  DateTimeFormatter.ofPattern("yyyy-MM-dd");

         Livro l1 = new Livro("Diário de um Banana", "Jeff Kiney", LocalDate.parse("2007-05-20", format), 50);
         Livro l2 = new Livro("Harry Potter", "Fulano Dital", LocalDate.parse("2010-06-25", format), 40);
         Livro l3 = new Livro("Bíblia", "Díscipulos", LocalDate.parse("2000-05-19", format), 30);

         livros.add(l1);
         livros.add(l2);
         livros.add(l3);


         System.out.println("Livros:");
         List<Livro> livrosAntesDe2010 = livros.stream().filter(livro -> livro.data.isBefore(date))
                 .collect(Collectors.toList());

         for(Livro livro : livros){
             livro.exibirInfo();
         }
         System.out.println("\n-------------------------------------------------------------------\n");
         System.out.println("Livros publicados antes de " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
         for(Livro livro : livrosAntesDe2010){
             livro.exibirInfo();
         }

         double somaValorLivros = livros.stream()
                 .mapToDouble(Livro -> Livro.valor)
                 .reduce(0.0, Double::sum);

         System.out.println("Soma de valores dos livros: "+ somaValorLivros);

         List<Double> valores = List.of(500.0, 1800.0, 9800.5);

         List<Double> valoresComImposto = valores.stream().map(valor -> valor + (valor * 0.5)).
                 collect(Collectors.toList());

         System.out.println(valores);
         System.out.println(valoresComImposto);

         double somaDeValores = valores.stream()
                 .reduce(0.0, Double::sum);

         System.out.println("Soma dos valores: " + somaDeValores);
     }
}