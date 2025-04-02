/* 
 *  Entradas : 
 *  num1
 *  num2
 *  opcao
 *  resultado
 *
 *  Processos: 
 *  se opcao for 1 -> resultado = num1 + num2
 *  se opcao for 2 -> resultado = num1 - nums2
 *  se opcao for 3 -> resultado = num1 * num2
 *  se opcao for 4 -> resultado = num2/num1 se o num2 = 0 e num1/num2 se num2 for diferente de 0
 * 
 * 
 *  Saidas:
 *  resultado
 * 
 * 
*/


import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado;

        System.out.println("Num 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Num 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case 4:
                if(num2 == 0 ){
                    resultado = num2 / num1;
                } else {
                    resultado = num1 / num2;
                }
                System.out.println(resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }


    }
}