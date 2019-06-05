
public class BuscaMaiorMenor {

    public int n1;
    public int n2;
    public int n3;
    public int n4;
    public int n5;
    public int maior;
    public int menor;

    public BuscaMaiorMenor(int n1, int n2, int n3, int n4, int n5, int maior, int menor) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.maior = maior;
        this.menor = menor;
    }

    public void getn1(int num1) {
        n1 = num1;
    }

    public int setn1() {
        return n1;
    }

    public void getn2(int num2) {
        n2 = num2;
    }

    public int setn2() {
        return n2;
    }

    public void getn3(int num3) {
        n3 = num3;
    }

    public int setn3() {
        return n3;
    }

    public void getn4(int num4) {
        n4 = num4;
    }

    public int setn4() {
        return n4;
    }

    public void getn5(int num5) {
        n5 = num5;
    }

    public int setn5() {
        return n5;
    }

    public void getmaior(int maiorn) {
        maior = maiorn;
    }

    public int setmaior() {
        return maior;
    }

    public void getmenor(int menorn) {
        menor = menorn;
    }

    public int setmenor() {
        return menor;
    }

}
