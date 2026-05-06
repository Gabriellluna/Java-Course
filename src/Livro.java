import java.time.LocalDate;
import java.time.Period;

public class Livro {
    String titulo;
    LocalDate data = LocalDate.now();
    LocalDate deadline;

    public Livro(String titulo, LocalDate deadline) {
        this.titulo = titulo;
        this.deadline = deadline;
    }

    public void calcularMulta(){
        Period periodo = Period.between(data, deadline);
        int days = periodo.getDays();
        System.out.printf("Livro:  %s | Multa por %d dias de atraso: %.2f", this.titulo, days, days * 2.50 );
    }

}
