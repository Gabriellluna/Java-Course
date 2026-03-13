import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double temp = 20;
        double farenheit = (temp * 9/5) + 32;
        System.out.printf("Temperatura Celsius: %.2f | Temperatura Farenheit: %.2f \n"
        , temp, farenheit);
        System.out.println("Temperatura Celsius: " + temp + "Temperatura Farenheit: " + farenheit);

    }
}