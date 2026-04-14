
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Insira um código");
         String code = scan.nextLine();

         Pattern pattern = Pattern.compile("^[A-Z]{3}-[0-9]{4}");
         Matcher matcher = pattern.matcher(code);
         if(matcher.find()){
             System.out.printf("Código correto no matcher 1 : %s\n", matcher.group());
         }else{
             System.out.println("Código inválido no matcher 1!");
         }
         //agora vamos ver sem usar o ^

         Pattern pattern2 = Pattern.compile("[A-Z]{3}-[0-9A-Za-z]{4}");
         Matcher matcher2 = pattern2.matcher(code);
         if(matcher2.matches()){
             System.out.printf("Código correto no matcher 2: %s\n", matcher2.group());
         }else{
             System.out.println("Código inválido no matcher 2!");
             //O SEGUNDO DÁ INVÁLIDO PORQUE USA MATCHES, VERIFICA A STRING INTEIRA
         }
    }
}
