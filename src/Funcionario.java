public class Funcionario {
    String cargo;
    String nome;
    double salario;

    public Funcionario(String cargo, String nome, double salario) {
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salario: %.2f \n\n" , salario);
    }

    public void reajustarSalario(double salario){
        this.salario = salario;
    }

}
