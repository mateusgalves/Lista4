
import java.util.Scanner;

public class BuscaMaiorMenorTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = ler.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = ler.nextInt();
        System.out.println("Digite o quarto numero: ");
        int n4 = ler.nextInt();
        System.out.println("Digite o quinto numero");
        int n5 = ler.nextInt();
        if (n1 > n2 | n2 > n3 | n3 > n4 | n4 > n5) {
            System.out.printf("O numero maior e: %d\n" + n1);
        } else {
            System.out.printf("O numero menor e: %d\n" + n1);
        }
        if (n2 > n1 | n1 > n3 | n3 > n4 | n4 > n5) {
            System.out.printf("O numero maior e: %d\n" + n2);
        } else {
            System.out.printf("O numero menor e: %d\n" + n2);
        }
        if (n3 > n1 | n1 > n2 | n3 > n4 | n4 > n5) {
            System.out.printf("O numero maior e: %d\n" + n3);
        } else {
            System.out.printf("O numero menor e: %d\n" + n3);
        }
        if (n4 > n1 | n1 > n2 | n2 > n3 | n4 > n5) {
            System.out.printf("O numero maior e: %d\n" + n4);

        } else {
            System.out.printf("O numero menor e: %d\n" + n4);
        }
        if (n5 > n1 | n1 > n2 | n2 > n3 | n3 > n4) {
            System.out.printf("O numero maior e: %d\n" + n5);
        } else {
            System.out.printf("O numero menor e: %d\n" + n5);
        }

    }

}
