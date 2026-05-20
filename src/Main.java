import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{

     public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        Livro livro1 = new Livro("Diário de um Banana", "Jeff Kiney", now, 15.90);
        livro1.exibirInfo();
        livro1.setValor(15.40);
        livro1.exibirInfo();

        String date = "10/05/2026";
        LocalDate data = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

         System.out.println(data);

     }
}
