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

    //assim que eu adiciono "extends Funcionario" a IDE deixa a linha toda em vermelho
    //Porque definimos um construtor em Funcionario, ou seja, precisamos setar os valores ao instanciar um novo objeto
    //e como Gerente é um Funcionario, precisamos herdar as mesmas informações
}
