import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{

     public static void main(String[] args) {

         List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
         List<Integer> numeros = List.of(2, 3, 5, 7, 11);
         List<String> funcionariosComMenosDe5Letras = funcionarios.stream().filter(s -> s.length() <= 5)
                         .collect(Collectors.toList());
         List<Integer> quadrados =  numeros.stream().map(valor -> valor * valor).collect(Collectors.toList());
         List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
         Double precoTotal = precosProdutos.stream().reduce(0.0, Double::sum);
         Double precosComImposto =  precoTotal + (precoTotal * 0.08);
         List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
         Double menorNota = notas.stream().min(Double::compareTo).get();
         Double maiorNota = notas.stream().max(Double::compareTo).get();
         Double media = notas.stream().reduce(0.0, Double::sum)/notas.size();
         System.out.println(funcionarios);
         System.out.println(funcionariosComMenosDe5Letras);
         System.out.println(numeros);
         System.out.println(quadrados);
         System.out.println("Total sem imposto: " + precoTotal);
         System.out.printf("Total com imposto %.2f: ", precosComImposto);
         System.out.printf("Menor nota %.2f: ", menorNota);
         System.out.printf("Maior nota %.2f: ", maiorNota);
         System.out.printf("Média das notas %.2f: ", media);
     }
}