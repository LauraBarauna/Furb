
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double media = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a altura " + (i + 1) + ": ");
            double altura = sc.nextDouble();
            media += (altura / 20);
        }

        System.out.println("Resultado: " + df.format(media));
    }
}
