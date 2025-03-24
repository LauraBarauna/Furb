/* 
 *  Entradas : 
 *  int valor
 *
 *  Processos: 
 *  valor % 2
 *  se o resultado de valor for 0, imprime que o número é par, se for diferente de 0 imprime
 *  que o número é ímpar
 * 
 *  Saidas:
 *  valor
 * 
 *  Testes:
 *  625 % 2 = 5 (ímpar)
 *  84 % 2 = 0 (par)
 * 
*/


import java.util.Scanner;

public class Exercicio2 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior do que 0: ");
        int valor = scanner.nextInt();

        if(valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        scanner.close();

   } 
}