public class Gerente extends Funcionario {

    private double bonus; // Gerente é um funcionário que tem bônus

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //aqui vamos sobrescrever o exibirInfo, altero um método da superclasse


    @Override
    public double getSalario() {
        return super.getSalario() + bonus;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Dados do Gerente\nNome: %s - Salário: %.2f - Bônus: %.2f\n", nome, getSalario(), this.bonus);
    }
}
