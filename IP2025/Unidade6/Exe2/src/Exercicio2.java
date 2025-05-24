import java.util.Scanner;

public class Exercicio2 {

    public Exercicio2() {
        double[] vetor = new double[12];
        Scanner sc = new Scanner(System.in);

        lerValores(vetor, sc);
        double media = calcularMedia(vetor);
        mostrarMaioresQueMedia(vetor, media);
    }

    private void lerValores(double[] vetor, Scanner sc) {
        System.out.println("Digite 12 valores reais:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }
    }

    private double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

    private void mostrarMaioresQueMedia(double[] vetor, double media) {
        System.out.println("\nMédia dos valores: " + media);
        System.out.println("Valores maiores que a média:");
        for (double valor : vetor) {
            if (valor > media) {
                System.out.println(valor);
            }
        }
    }

    public static void main(String[] args) {
        new Exercicio2(); // Tudo acontece no construtor
    }
}
