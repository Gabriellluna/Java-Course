
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Insira o CPF");
         String code = scan.nextLine();

         Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{3}.[0-9]{2}");
         Matcher matcher = pattern.matcher(code);


         if (matcher.matches()){
             System.out.println("CPF Válido: " + matcher.group());
         }else{
             System.out.println("CPF Inválido");
         }
    }
}
