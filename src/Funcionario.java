public class Funcionario {
    // Herança, possibildiade de classes filhas herdarem atributos de classes pais
    // Funcionário (pai) - Desenvolvedor (Filha) - Gerente (Filha)
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInfo(){
        System.out.printf("Nome: %s - Salário: %.2f\n", this.nome, this.salario);
    }

    public void reajusteSalarial(double porcentagem){
        this.salario = this.salario + (this.salario * porcentagem);
    }
}
