import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double soma = 0;

        for (int i = 1; i <= 100; i++) {

            soma += (1.0 / i);

        }

        System.out.println("Resultado: " + df.format(soma));

    }
}