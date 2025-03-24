/* 
 *  Entradas: 
 *  int num1
 *  int num2
 *
 *  Processos: 
 *  se o num1 for maior que num2, escreve num1 é maior que num2
 *  e se o num2 for maior que num1, escreve num2 é maior que num1
 * 
 *  Saidas:
 *  O valor num1 é maior que o valor num2 ou
 *  O valor num2 é maior que o valor num1
 * 
 *  Testes:
 *  num1 = 10 e num2 = 20
 *  O valor 20 é maior que o valor 10
 * 
 *  num1 = 40 e num2 = 10
 *  O valor 40 é maior que o valor 10
 * 
*/


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if( num1 > num2 ) {
            System.out.println("O valor " + num1 + " é maior que o valor " + num2);
        } else if(num2 > num1) {
            System.out.println("O valor " + num2 + " é maior que o valor " + num1);
        }

        scanner.close();
    }
}