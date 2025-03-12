
/* 
 *  Entradas : 
 *  double comprimento
 *  double altura
 *
 *  Processos: 
 *  double area =  comprimento * altura
 *  double totalAzulejos = area * 9
 *  double custoTotal = 12.50 * totalAzulejos 
 * 
 *  Saidas:
 *  custoTotal
 * 
 *  Testes:
 *  double area =  6 * 2 = 12
 *  double totalAzulejos = 12 * 9 = 108
 *  double custoTotal = 12.50 * 108 = 1350 
 * 
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorAzulejo = 12.50;

        System.out.println("Digite a comprimento: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite o altura: ");
        double altura = scanner.nextDouble();

        double area = comprimento * altura;
        double totalAzulejos = area * 9;
        double custoTotal = valorAzulejo * totalAzulejos;

        System.out.println("O valor final é R$ " +custoTotal);

    }
}