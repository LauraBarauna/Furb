import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        int numPiramide = 1;
        int linha = 0;
        for (int i = 1; i <= num; i++) {

            for (int j = 0; j <= linha; j++) {
                System.out.print(numPiramide + " ");
                numPiramide++;
            }
            linha++;
            System.out.println();
        }

    }
}
