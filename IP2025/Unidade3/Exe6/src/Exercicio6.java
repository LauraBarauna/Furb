/* 
 *  Entradas : 
 *  double pesoPratoCliente
 *
 *  Processos: 
 *  double valorPrato = (pesoPratoCliente - 0.750) * 25.00
 * 
 *  Saidas:
 *  valorPrato
 * 
 *  Testes:
 *  valorPrato = (2.42 - 0.750) * 25.00 = 41.75
 *  valorPrato = (1.77 0 0.750) * 25.00 = 25.50
 * 
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoPrato = 0.750;
        double precoKg = 25.00;

        System.out.println("Digite o peso do prato: ");
        double pesoPratoCliente = scanner.nextDouble();

        double valorPrato = (pesoPratoCliente - pesoPrato) * precoKg;

        System.out.println("O valor do prato do cliente é R$ " + valorPrato);
        

    }
}