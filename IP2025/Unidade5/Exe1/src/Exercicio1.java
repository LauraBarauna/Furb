import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1 ) + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }

        }

    }
}