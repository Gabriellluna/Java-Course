import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float nota1 = 7.5f;
        float nota2 = 8;
        float nota3 = 9;
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        nota1 = scanner.nextFloat();*/
        float media = (nota1+nota2+nota3) / 3;
        System.out.printf("Sua média é %f \n", media); /*printf colocamos o %[tipo var] e depois da vírgula a var*/
        System.out.println("Sua média é " + media); /*println colocamos a var no meio do texto com "" + ""*/

    }
}