import java.util.Scanner;

class Exercicio30 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor inicial N: ");
        int N = sc.nextInt();

        System.out.print("Digite o decremento K: ");
        int K = sc.nextInt();

        System.out.print("Digite o tamanho máximo da mochila M: ");
        int M = sc.nextInt();

        // Variáveis auxiliares
        int atual = N;
        int somaMochila = 0;
        int somaFora = 0;

        String elementos = "";
        String entrou = "";
        String fora = "";

        // Construindo a sequência e decidindo o que entra ou não
        while (atual > 0) {
            elementos += atual + " ";

            if (somaMochila + atual <= M) {
                somaMochila += atual;
                entrou += atual + " ";
            } else {
                somaFora += atual;
                fora += atual + " ";
            }

            atual -= K;
        }

        // Saída
        System.out.println("\nElementos a serem colocados na mochila:");
        System.out.println(elementos);

        System.out.println("Elementos que entraram na mochila:");
        System.out.println(entrou);

        System.out.println("Elementos que ficaram fora da mochila:");
        System.out.println(fora);

        System.out.println("Soma dos elementos que entraram: " + somaMochila);
        System.out.println("Soma dos elementos que ficaram fora: " + somaFora);

        sc.close();
    }
}
