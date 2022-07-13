import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("qual o seu nome?");
        String primeiroNome = s.next();

        s = new Scanner(System.in);
        System.out.println("Vamos fazer uma conta, digite um numero");
        int primeiroNumero = s.nextInt();

        s = new Scanner(System.in);
        System.out.println("Digite outro numero");
        int segundoNumero = s.nextInt();

        System.out.println("Agora vamos as contas, " + primeiroNome);
        System.out.println("SOMA = " + (primeiroNumero + segundoNumero));
        System.out.println("SUBTRACAO = " + (primeiroNumero - segundoNumero));
        System.out.println("DIVISAO = " + (primeiroNumero / segundoNumero));
        System.out.println("MULTIPLICACAO = " + (primeiroNumero * segundoNumero));
    }

}
