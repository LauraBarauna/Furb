import java.util.Scanner;

public class Exercicio8 {

    public Exercicio8(Scanner sc) {

        int n;
        do {
            System.out.println("Digite um valor (máximo 20): ");
            n = sc.nextInt();
        } while (n > 20);

        double[] reais = new double[n];
        int[] frequencia = new int[n];

        escreverReais(reais, sc);
        calcularFrequencia(reais, frequencia);
        mostrarFrequenciaEReais(reais, frequencia);
    }

    public void escreverReais(double[] reais, Scanner sc) {
        for (int i = 0; i < reais.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            reais[i] = sc.nextDouble();
        }
    }

    public void calcularFrequencia(double[] reais, int[] frequencia) {
        for (int i = 0; i < reais.length; i++) {
            frequencia[i] = 1;
            for (int j = 0; j < i; j++) {
                if (reais[i] == reais[j]) {
                    frequencia[i] = 0;
                    break;
                }
            }

            if (frequencia[i] != 0) {
                for (int j = i + 1; j < reais.length; j++) {
                    if (reais[i] == reais[j]) {
                        frequencia[i]++;
                    }
                }
            }
        }
    }

    public void mostrarFrequenciaEReais(double[] reais, int[] frequencia) {
        for (int i = 0; i < reais.length; i++) {
            if (frequencia[i] != 0) {
                System.out.println("Valor: " + reais[i] + " - Frequência: " + frequencia[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Exercicio8(sc);
    }
}
