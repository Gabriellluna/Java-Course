import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main
{

     public static void main(String[] args) {

         //AGORA VAMOS VER O POLIMORFISMO NA PRÁTICA - OBJETOS DE DIFERENTES CLASSES COMPARTILHEM A MESMA SUPERCLASSE
         //CASO EU QUEIRA TRANSFORMAR UM FUNCIONARIO EM GERENTE, EU CONSIGO COM CASTING SE EU USAR ESSA FORMA DE CRIAÇÃO
         //DE OBJETOS, COM UMA SUPERCLASSE SENO
         Funcionario gerente = new Gerente("Gabriel", 1250);
         Funcionario funcionario = new Funcionario("Gustavo", 250);
         Funcionario desenvolvedor = new Desenvolvedor("Mateus", 10000, "Java");
         //ESTOU INSERINDO NO ESPAÇO DE MEMÓRIA, QUE SÓ ACEITA UM TIPO DE OBJETO DO TIPO FUNCIONÁRIO, UM OBJETO DO TIPO
         //GERENTE, DESENVOLVEDOR E FUNCIONÁRIO, QUE SÃO SUBCLASSES DE FUNCIONÁRIO
         //funcionario.setBonus(5000) isso não funciona
         ((Gerente) gerente).setBonus(5000);
         System.out.println(((Gerente) gerente).getBonus());
         gerente.exibirInfo();
         desenvolvedor.exibirInfo();
         ((Desenvolvedor)desenvolvedor).setStack("HTML kakaka");
         desenvolvedor.exibirInfo();

     }
}
