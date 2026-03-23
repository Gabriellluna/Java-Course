import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ENTRADA DO USUÁRIO*/
        Scanner scanner = new Scanner(System.in); //criamos uma instância de scanner para pegar valores digitados pelo usuário
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            System.out.println("\nInsira um número: ");
            numeros.add(scanner.nextInt());
        }
        int maior = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) > maior){
                maior = numeros.get(i);
            }
        }
        System.out.println("O maior número é o " + maior);
    }
}