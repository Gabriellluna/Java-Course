
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{
    public static String formatarTelefone(String telefone){
        Pattern pattern = Pattern.compile("(\\d{2})(\\d{4,5})(\\d{4})");
        Matcher match = pattern.matcher(telefone);
        if(match.find()){
            return String.format("Número de telefone com máscara: (%s) %s-%s", match.group(1), match.group(2), match.group(3));
        }else{
            return "Número de telefone inválido";
        }
    }
    public static String verificaEmail(String email){
        Pattern pattern1 = Pattern.compile("[a-zA-Z0-9_.-]+@[a-zA-Z0-9]+\\.[a-z]{2}");
        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9_.-]+@[a-zA-Z0-9]+\\.[a-z]{2}\\.[a-z]{2}");

        Matcher match1 = pattern1.matcher(email);
        Matcher match2 = pattern2.matcher(email);

        if(match2.find()){
            return "O seu e-mail é válido pelo match2";
        } else if(match1.find()){
            return "O seu e-mail é válidasso";
        } else {
            return "O seu e-mail é inválido";
        }
    }

    public static void main(String[] args) {
        //Regex - Expressões regulares - Regular Expressions
        String texto = "Meu e-mail é #gabriel@gmail.com.brbrbr";
        //como eu verifico se dentro do texto há um padrão de e-mail?
        //COM REGEX! api REGEZ
        //DUAS CLASSES: PATTERN - onde vamos definir o padrão
        //              MATCHER - verificação de match
        System.out.println(formatarTelefone("11548951"));
        System.out.println(verificaEmail("gabriellunamaia@gmail.com.br"));




    }
}
