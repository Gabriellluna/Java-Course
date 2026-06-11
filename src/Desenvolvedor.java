public class Desenvolvedor extends Funcionario {
    private String stack;;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Dados do Gerente\nNome: %s - Salário: %.2f - Stack: %s\n", nome, getSalario(), this.stack);
    }
}
