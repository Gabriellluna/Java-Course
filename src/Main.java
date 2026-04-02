
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //string é uma classe em Java
        String nome = "Gabriel";
        String nome_composto = """
                Gabriel
                18 anos
                Dev Jr
                """;

        //formatação de String
        String nome_grande = String.format("Nome: %s \nNome Composto: %s", nome, nome_composto);
        System.out.println(nome_grande);
        //para formatar:
        // %s - String
        // %d - int
        // %f - float/double
        // %.2f - formata com limite de casas decimais

        //métodos de manipulação
        // trim() - tira o espaço em branco da String
        // toLowerCase()/toUpperCase()
        // replace()
        // chartAt() - pega um caractere específico de uma String
        // substring() - pega uma faixa de caracteres
        // ...
        System.out.println(nome_grande.toUpperCase());
        System.out.println(nome_grande.replace("18 anos", "20 anos"));
        System.out.println(nome_grande.charAt(0));
        System.out.println(nome_grande.substring(0,5));
    }
}
