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
        if (n1 % 2 == 0) { //se número 1 for par
            lista.add(n1);
            do{
                n1 += 2;
                if(n1 > n2){
                    break;
                }
                lista.add(n1);
                System.out.println("teste");
            }while(n1 <= n2);

        }else{ //se número 1 for ímpar
            n1 += 1;
            lista.add(n1);
            while(n1 <= n2){
                n1 += 1;
                if(n1%2 == 0){
                    lista.add(n1);
                }
                if(n1>n2){
                    break;
                }
            }
        }
        System.out.println(lista);
        for(int i = 0; i < lista.size(); i++){
            soma = soma + lista.get(i);
        }
        System.out.println("Soma dos números no intervalor de " + n1 + "e" + n2 + ": " + soma);
    }
}