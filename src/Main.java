
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite os números separados por espaço: ");
        String[] numeros = scan.nextLine().split(" ");
        int maior = 0;
        for(String numero : numeros){
            int numero_int = Integer.parseInt(numero);
            if (numero_int > maior){
                maior = numero_int;
            }
        }
        System.out.printf("O maior número da lista é o %d", maior);
    }
}
