
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{

     public static void main(String[] args) {
         Pattern pattern = Pattern.compile("[0-9]{2}[/-][0-9]{2}[/-][0-9]{4}");
         Scanner scan = new Scanner(System.in);
         System.out.println("Insira o período de antecedência em dias: ");
         int antecedencia = 0;
         try{
             antecedencia = scan.nextInt();
         }catch (Exception e){
             System.out.println("Inserção de valor errado " + e.getMessage());
         }
         System.out.println("Insira a data de vencimento (dd-mm-aaaa): ");
         String date = scan.next();
         Matcher matcher = pattern.matcher(date);
         System.out.println(antecedencia);
         if(matcher.matches()){
             System.out.println("Data de vencimento: " + date + " é válida");
         }else{
             System.out.println("Data de vencimento: " + date + " é INválida");
         }

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

         LocalDate formatedDate = LocalDate.parse(date.replace('/', '-'), formatter);

         System.out.println("Data do lembrete: " + formatedDate.minusDays(antecedencia).format(formatter));

         ZonedDateTime fuso = ZonedDateTime.now(); // esse aqui por enquanto pega o valor de onde estou
         ZonedDateTime Tokio = fuso.withZoneSameInstant(ZoneId.of("Asia/Tokyo")); // aqui nós passamos de qual país queremos o horário
         System.out.println("Data em Tokyo: " + Tokio.format(formatter));
         System.out.println("Horário em Tokyo: " + Tokio.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
     }
}

