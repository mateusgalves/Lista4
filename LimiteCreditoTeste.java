
import java.util.Scanner;

public class LimiteCreditoTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int NConta = ler.nextInt();

        System.out.println("Digite o seu saldo Inicial do mes: ");
        int InicioMes = ler.nextInt();

        System.out.println("Digte o Total do valor das compras feitas: ");
        int ItensT = ler.nextInt();

        System.out.println("Digite o seu total de credito: ");
        int CTotal = ler.nextInt();

        System.out.println("Digite o limite do seu cartao: ");
        int LimiteFinal = ler.nextInt();

        System.out.println("O seu novo saldo e: " + (InicioMes - ItensT));
        int NSaldo = (InicioMes - ItensT);

        if (LimiteFinal > NSaldo) {
            System.out.println("Limite excedido");
        }

    }

}
