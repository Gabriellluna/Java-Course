
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{

    public static String formatDate(String date){
        Pattern pattern= Pattern.compile("([0-9]{4})-([0-9]{2})-([0-9]{2})");
        Matcher matcher = pattern.matcher(date.toString());
        String formatedDate = "";
        if(matcher.find()){
            formatedDate = matcher.group(3) + "/" + matcher.group(2) + "/" + matcher.group(1);
        }
        return formatedDate;
    }
     public static void main(String[] args) {
        // Data e hora em Java
        // API nova que é o JavaTime
        // LocalDate, LocalTime, LocalDateTime
        // .of(ano, mês, dia, hora ou minuto)
        // .parse() converte
        // .now() momento exato
         LocalDate dataCompra = LocalDate.now();
         LocalDate dataPrimeiraParcela = LocalDate.of(2026, 4, 30).plusDays(5);
         LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(45); //minusDays


         System.out.println("Data da compra: "+ formatDate(dataCompra.toString()));
         System.out.println("Data da primeira parcela: "+ formatDate(dataPrimeiraParcela.toString()));
         System.out.println("Data da segunda parcela: "+ formatDate(dataSegundaParcela.toString()));
         System.out.println(dataCompra.isEqual(LocalDate.now()));
         System.out.println(dataPrimeiraParcela.isEqual(LocalDate.now()));

         //ou ao invés de usar regex, podemos usar DateTime Formatter

         DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("hh:mm:ss");
         LocalTime time = LocalTime.now();

         System.out.println("Formato da data da compra com DateTimeFormatter: "+ dataCompra.format(formatterDate));
         System.out.println("Formato da data da compra com DateTimeFormatter: "+ time.format(formatterTime));

         ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
         ZonedDateTime newYork = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));

         System.out.println("Data da conclusão da compra em NY: "+ newYork.format(formatterDate));

         LocalTime horaInicio = LocalTime.now();
         LocalTime horaFim = horaInicio.plusHours(1).plusMinutes(30);

         Duration periodo = Duration.between(horaInicio, horaFim);

         System.out.println("Periodo da compra com DateTimeFormatter: "+ periodo.toHours() + "h " + periodo.toMinutesPart() + "m");

         Period periodoPgtoVencimento = Period.between(dataPrimeiraParcela, dataSegundaParcela);

         System.out.println(periodoPgtoVencimento.getMonths() + "meses " +  periodoPgtoVencimento.getDays() + "dias");

     }
}

