import java.time.LocalDate;
import java.util.*;

public class Main
{

     public static void main(String[] args) {
         //COLEÇÕES - LIST | SET | MAP
         //LIST - ORDENAÇÃO DOS ELEMENTOS E PERMITE DUPLICIDADE
         //LIST - Implementações: ArrayList (buscas rápidas) e LinkedList (muitas inserções)

         List<String> amigos = new ArrayList<>();
         amigos.add("Luna");
         amigos.add("Maia");
         amigos.add("Luna");
         System.out.println(amigos);

         //SET - SEM PREOCUPAÇÃO COM ORDENAÇÃO E NÃO PERMITE DUPLICIDADE
         //SET - Implementações: HashSet (+ rápido), LinkedHashSet (mantém ordem de inserção), TreeSet (ordenação e mais lento)

         Set<String> funcionarios = new HashSet<>();
         funcionarios.add("Lucco");
         funcionarios.add("Lima");
         funcionarios.add("Lucas");
         funcionarios.add("Gustavo");
         System.out.println(funcionarios);

         //MAP - CHAVE-VALOR, NÃO PERMITE VALORES DUPLICADOS
         //MAP - Implementações: HashMap (+ rápido, nn mantém ordem), LinkedHashMap (mantém ordem), TreeMap (ordem pela chave)
         //Dois tipos de dados na declaração do tipo, justamente por ser CHAVE - VALOR
         //Verifica a duplicidade pela chave
         Map<Integer, String> produtos = new HashMap<>();

         produtos.put(1, "Cerveja");
         produtos.put(2, "Uísque");
         produtos.put(2, "Água de Coco");
         produtos.put(3, "Bolo de Maçã");
         produtos.put(4, "Bolo de Maçã");
         produtos.put(5, "Bolo de Maçã");
         produtos.put(6, "Bolo de Maçã");

         System.out.println(produtos);
         System.out.println(produtos.get(6));
         System.out.println(produtos.equals(produtos));

     }
}