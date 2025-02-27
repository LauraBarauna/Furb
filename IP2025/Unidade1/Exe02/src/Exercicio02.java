import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args) {
        
       /*
        *  Leia 2 valores inteiros 
        *  e imprima sua multiplicação.
        *
        *
        *  Entrada: valor1, valor2
        *  Saída: multiplicação
        *  Processo: multiplicação = valor1 * valor2
        *
        *
        *  Testes:
        *    valor1        |2|10|-5
        *    valor2        |4|10|10
        *    multiplicação |8|100|-50
        */

        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Digite o valor 1: ");
        valor1 = scanner.nextInt();

        System.out.println("Digite o valor 2: ");
        valor2 = scanner.nextInt();

        scanner.close();

        int multiplicação = valor1 * valor2;

        System.out.println(valor1 + " X " + valor2 + " = " + multiplicação);


    }
}