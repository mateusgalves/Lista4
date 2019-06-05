
import java.util.Scanner;

public class ConsumoMedioTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a gasolina gasta no 1º abastecimento:");
        int gasolina1 = ler.nextInt();

        System.out.println("Digite a quilometragem no 1º teste:");
        float consumo1 = ler.nextFloat();

        System.out.println("Digite a gasolina gasta no 2º abastecimento:");
        int gasolina2 = ler.nextInt();

        System.out.println("Digite a quilometragem no 2º teste:");
        float consumo2 = ler.nextFloat();

        System.out.println("Digite a gasolina gasta no 3º abastecimento:");
        int gasolina3 = ler.nextInt();

        System.out.println("Digite a quilometragem no 3º teste:");
        float consumo3 = ler.nextFloat();

        System.out.println("A media do primeiro consumo:" + gasolina1 / consumo1);
        int total1 = (int) (gasolina1 / consumo1);

        System.out.println("A media do segundo consumo:" + gasolina2 / consumo2);
        int total2 = (int) (gasolina2 / consumo2);

        System.out.println("A media do terceiro consumo:" + gasolina3 / consumo3);
        int total3 = (int) (gasolina3 / consumo3);

        System.out.println("Consumo total:" + total1 + total2 + total3);

    }

}
