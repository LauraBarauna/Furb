/* 
 *  Entradas : 
 *  int num1
 *  int num2
 *
 *  Processos: 
 *  se o resto da divisão de num1 com num2 = 0 (num1 % num2 == 0), os valores são múltiplos
 *  se o resto da dívisao de num1 com num2 for diferente de 0 os valores não são múltiplos
 * 
 *  Saidas:
 *  Os valores são multiplos ou Os valores não são multiplos
 * 
 *  Testes:
 *  int num1 = 6
 *  int num2 = 3
 *  valores são múltiplos
 * 
 *  int num1 = 9
 *  int num2 = 4
 *  valores não são múltiplos
 * 
*/


import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if(num1 % num2 == 0) {
            System.out.println("Os valores são múltiplos");
        } else {
            System.out.println("Os valores não são múltiplos");
        }

    }
}
