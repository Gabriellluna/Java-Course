public class Main {
    public static void main(String[] args){
        System.out.println(("Hello World!"));
        int steps = 500;
        double height = 1.75;
        boolean vf = true;

        Paciente gabriel = new Paciente();
        System.out.println((gabriel));

        //conversão explícita é usada para casos que vão contra a hierarquia -> double > int
        int alturaEmCm = (int) (height * 100);
        System.out.println((alturaEmCm));

        //conversão implícita só funciona na ordem da hierarquia -> int > double
        int valorInt = 19;
        double valorDouble = valorInt;
        System.out.println(valorDouble);

    }
}