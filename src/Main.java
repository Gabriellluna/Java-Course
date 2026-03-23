import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Gabriel", "Gustavo", "Felipe"};
        double[] notas = {7.80, 5.50, 6.80};

        //for para apresentar todas as notas
        System.out.println("FOR");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno " + nomes[i] + ". Nota: " + notas[i]);
        }
        System.out.println("\n\nWHILE");
        //while e do-while para apresentar todas as notas acima da média 6
        int j = 0;
        while (j < nomes.length) {
            if (notas[j] < 6) {
                j++;
                continue;
            }
            System.out.println("Aluno " + nomes[j] + ". Nota: " + notas[j]);
            j++;
        }
        System.out.println("\n\nDO WHILE");
        j = 0;
        do {
            if (notas[j] < 6) {
                j++;
                continue;
            }
            System.out.println("Aluno " + nomes[j] + ". Nota: " + notas[j]);
            j++;

        } while (j < nomes.length);

        System.out.println("\n\nFOR EACH\n\n");
        for(String nome : nomes){
            if (nome.equals("Gustavo")){break;}
            System.out.println(nome);
        }
        for(double nota : notas){
            System.out.println(nota);
        }
    }
}