import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean go =  true;
        boolean stop = false;
        List<String> convidados = new ArrayList<>();
        while(go){
            stop = false;
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String input = scan.nextLine();
            for(String convidado : convidados){
                if(convidado.equals(input)){
                    System.out.printf("O nome %s já foi adicionado na lista de convidados \n", convidado);
                    stop = true;
                }
            }
            if(input.equals("sair")){
                go = false;
            }else if(input.equals("ver")){
                System.out.println(convidados);
            }else if(stop){
                continue;
            }else {
                convidados.add(input);
                System.out.printf("O nome %s foi adicionado à lista de convidados\n", input);
            }
        }
    }
}