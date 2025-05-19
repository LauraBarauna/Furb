import java.util.Scanner;

public class Exercicio4 {

    public Exercicio4(Scanner sc, int[] vetor1, int[] vetor2) {
        escrever(sc, vetor1, vetor2);
        ler(vetor1, vetor2);
    }

    public void escrever(Scanner sc, int[] vetor1, int[] vetor2) {

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o valor do vetor 1 para o número " + (i + 1) + ": ");
            vetor1[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o valor do vetor 2 para o número " + (i + 1) + ": ");
            vetor2[i] = sc.nextInt();
        }
    }

    public int[] somar(int[] vetor1, int[] vetor2) {
        int[] somaVetores = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            somaVetores[i] = vetor1[i] + vetor2[i];
        }
        return somaVetores;
    }

    public void ler(int[] vetor1, int[] vetor2) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Vetor 1: " + vetor1[i] + " - Vetor 2: " + vetor2[i] + " - Soma vetores: " + somar(vetor1, vetor2)[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        new Exercicio4(sc, vetor1, vetor2);
    }

}
