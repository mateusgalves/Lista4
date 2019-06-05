
import java.util.Scanner;

public class RetanguloTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da altura do retangulo: ");
        int x = ler.nextInt();

        System.out.println("Digite o valor da base do retangulo: ");
        int y = ler.nextInt();

        System.out.println("A area do retangulo e: " + x * y);
    }

}
