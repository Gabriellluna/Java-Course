import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate data;
    private double valor;

    public Livro(String titulo, String autor, LocalDate data, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void exibirInfo(){
        String date = this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("%s - %s. Data de publicação: %s . R$%.2f\n", this.titulo, this.autor, date, this.valor);
    }
}
