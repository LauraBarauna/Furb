import java.util.Scanner;

public class Exercicio7 {

    public Exercicio7(int[] vetor, Scanner entrada) {
        inserir(vetor, entrada);
        System.out.println();
        ordenar(vetor);
        System.out.println();
        mostrar(vetor);
    }

    public void inserir (int[] vetor, Scanner entrada) {
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = entrada.nextInt();

            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (vetor[j] == numero) {
                    System.out.println("Esse valor já existe! Digite novamente");
                    i--;
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                vetor[i] = numero;
            }
        }
    }

    public void ordenar(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public void mostrar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[4];
        new Exercicio7(vetor, entrada);
    }


}
