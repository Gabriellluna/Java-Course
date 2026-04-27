import java.util.Scanner;

public class Main
{

     public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedreiro", "Gabriel", 8500);
        Funcionario funcionario2 = new Funcionario("Lojista", "João", 4000);

        funcionario1.exibirInfo();
        funcionario2.exibirInfo();

        funcionario2.reajustarSalario(10);

        funcionario2.exibirInfo();
     }
}