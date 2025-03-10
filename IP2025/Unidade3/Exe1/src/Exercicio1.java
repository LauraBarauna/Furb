/* 
 *  Entradas : 
 *  int largura
 *  int comprimento
 * 
 *  Processos: 
 *  int area = largura * comprimento
 * 
 *  Saidas:
 *  area
 * 
 *  Testes:
 *  area = 10 * 5 = 50
*/


import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a dimensão da largura: ");
        int largura = scanner.nextInt();

        System.out.println("Digite a dimensão do comprimento: ");
        int comprimento = scanner.nextInt();

        int area = largura * comprimento;

        System.out.println("A area é de " +area);


    }
}