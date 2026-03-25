import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dois números para gerar um intervalo e eu calcular a soma dos números pares: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int soma = 0;
        List<Integer> lista = new ArrayList<>();
        for(int i = n1; i<=n2; i++){
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        for(int i = 0; i < lista.size(); i++){
            soma = soma + lista.get(i);
        }
        System.out.println(lista);
        System.out.println("Soma dos números no intervalor de " + n1 + " e " + n2 + ": " + soma);
    }
}