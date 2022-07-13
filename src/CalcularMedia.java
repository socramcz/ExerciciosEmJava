// IMPORT NECESSARIO PARA O PROGRAMA RECEBER INPUT'S
import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        // LINHA DE CODIGO PARA CHAMAR O IMPORT
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String primeiroNome = s.next();

        System.out.println("Bem vindo, aluno "+ primeiroNome);
        System.out.println("Vamos calcular se voce passou de ano");

        // INPUT'S PARA PEGAR AS VARIAVEIS
        s = new Scanner(System.in);
        System.out.println("Digite a sua 1a nota");
        int primeiraNota = s.nextInt();

        s = new Scanner(System.in);
        System.out.println("Digite a sua 2a nota");
        int segundaNota = s.nextInt();

        s = new Scanner(System.in);
        System.out.println("Digite a sua 3a nota");
        int terceiraNota = s.nextInt();

        s = new Scanner(System.in);
        System.out.println("Digite a sua 4a nota");
        int quartaNota = s.nextInt();

        // ONDE A FUNÇÃO É CHAMADA
        teste(primeiroNome, primeiraNota, segundaNota, terceiraNota, quartaNota);

    }

    // FUNÇÃO TESTE
    static void teste(String primeiroNome,int primeiraNota, int segundaNota, int terceiraNota, int quartaNota) {
        var media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media > 6){
            System.out.println("Parabens " +primeiroNome+ ", voce foi aprovado. Sua media => "+media);
        } else{
            System.out.println("Infelizmente " +primeiroNome+ ",voce foi reprovado. Sua media => "+media);
        }
    }
}
