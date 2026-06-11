import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main
{

     public static void main(String[] args) {

         Gerente gerente = new Gerente("Mario", 15000);

         Funcionario funcionario = new Funcionario("Luiz", 5000);

         Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel", 2500, "JavaScript");

         gerente.exibirInfo();
         funcionario.exibirInfo();
         gerente.reajusteSalarial(0.5);
         funcionario.reajusteSalarial(0.5);
         gerente.exibirInfo();
         funcionario.exibirInfo();
         desenvolvedor.exibirInfo();
     }
}
