import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*criando constantes para o programa*/
        final double CONSUMO_MEDIO = 12.5;
        final double CAPACIDADE = 50;
        final double COMBUSTIVEL = 20;
        final double DISTANCIA = 280;

        System.out.println("A capacidade máxima do veículo é de "+(int) (CONSUMO_MEDIO*CAPACIDADE)+" km com um tanque cheio");
        System.out.printf("Autonomia atual: %.0f \n", CONSUMO_MEDIO*COMBUSTIVEL);
        if (CONSUMO_MEDIO*COMBUSTIVEL < DISTANCIA){
            System.out.println("Você não conseguirá finalizar a viagem");
        }else{
            System.out.println("Você conseguirá chegar ao seu destino");
        }
    }
}