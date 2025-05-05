import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maior = 0;
        double menor = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            double n = sc.nextDouble();

            if (i == 0) {
                menor = n;
            }

            if (n > maior) {
                maior = n;
            } else if (n <= menor) {
                menor = n;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}