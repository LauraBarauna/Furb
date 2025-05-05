import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de repetições: ");
        int qtdRepeticao = sc.nextInt();
        int menor = 0;
        double media = 0;
        int divisao = 0;

        for (int i = 0; i < qtdRepeticao; i ++) {
            System.out.println("Digite número " + (i+1) + ": ");
            int num = sc.nextInt();

            if (num < 0) {
                if (i == 0) {
                    menor = num;
                }

                if (num < menor) {
                    menor = num;
                }
            } else {
                divisao++;
                media += num; 

                if (i == 4) {
                    media /= (double) divisao; 
                }

            }
        }

        System.out.println("Menor valor negativo: " + menor);
        System.out.println("Média dos números positivos: " + media);
    }
}