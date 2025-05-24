import java.util.Scanner;

public class Exercicio1 {

    public Exercicio1() {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);

        lerNumeros(vetor, sc);
        escreverInverso(vetor);
    }

    private void lerNumeros(int[] vetor, Scanner sc) {
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
    }

    private void escreverInverso(int[] vetor) {
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Exercicio1(); // Tudo acontece no construtor
    }
}
