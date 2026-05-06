import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Livro {
    String titulo;
    String  autor;
    LocalDate data;
    double valor;

    public Livro(String titulo, String autor, LocalDate data, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
        this.valor = valor;
    }

    public void exibirInfo(){
        String date = this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("%s - %s. Data de publicação: %s . R$%f\n", this.titulo, this.autor, date, this.valor);
    }
}
