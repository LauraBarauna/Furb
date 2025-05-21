import java.util.Scanner;

public class Exercicio6 {

    public void ler (int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public boolean encontrarValor (int[] vetor, int novoValor) {
        if (vetor.length == novoValor) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int[] vetor = new int[sc.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        Exercicio6 ex = new Exercicio6();

        System.out.println("LENDO");
        ex.ler(vetor);

        System.out.println();
        System.out.println("Digite o tamanho do vetor: ");
        int novoTamanho = sc.nextInt();

        System.out.println();
        System.out.println("VETOR ENCONTRADO?");
        if (ex.encontrarValor(vetor, novoTamanho)) {
            System.out.println("Vetor encontrado");
        } else {
            System.out.println("Vetor não encontrado");
        }


    }
}
