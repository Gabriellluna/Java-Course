
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
         Scanner input = new Scanner(System.in);

         DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
         System.out.println("Insira o horário de entrada (hh:mm): ");
         LocalTime enterTime = LocalTime.parse(input.nextLine(), format);
         System.out.println("Insira sua carga horária: ");
         int hours = input.nextInt();
         System.out.println("Insira o horário de saída (hh:mm): ");
         LocalTime exitTime = LocalTime.parse(input.next(), format);
         System.out.println("Horário de entrada: " + enterTime);
         System.out.println("Horário de saída previsto: " + enterTime.plusHours(hours).format(format));
         System.out.println("Horário de saída: " + exitTime);
         Duration durationReal = Duration.between(enterTime, exitTime); // trabalhou real
         Duration durationFake = Duration.between(enterTime, enterTime.plusHours(hours)); // trabalhou na lei
         System.out.println("Saldo de horas: " +durationReal.minus(durationFake).toHours() + ":" +
         durationReal.minus(durationFake).toMinutesPart());
     }
}