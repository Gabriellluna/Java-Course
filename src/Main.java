import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ENTRADA DO USUÁRIO*/
        Scanner scanner = new Scanner(System.in); //criamos uma instância de scanner para pegar valores digitados pelo usuário
        System.out.print("Insira um número: "); //guarda o valor inserido pelo usuário em uma variável
        int numero =  scanner.nextInt();
        if (numero % 2 == 0){
            System.out.printf("O número %d é par", numero);
        }else{
            System.out.printf("O número %d é ímpar", numero);
        }
        List<Double> notas = new ArrayList<>();
        double media = 0;
        for (int i = 1; i < 3; i++){
            System.out.println("\nInsira a sua nota da prova " + i + ":");
            notas.add(scanner.nextDouble());
            media +=notas.get(i - 1);
        }
        if(media / notas.size() >= 7){
            System.out.println("Você foi aprovado. Média: "+media);
        }else if(media / notas.size() >= 5){
            System.out.println("Você está de recuperação. Média: "+media);
        }else{
            System.out.println(("Você foi reprovado. Média: "+media));
        }
    }
}