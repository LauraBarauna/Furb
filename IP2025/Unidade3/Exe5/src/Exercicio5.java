/* 
 *  Entradas : 
 *  int qtdFrango
 *
 *  Processos: 
 *  double gastoTotalGranja = (double) ( ( 3.50 * 2 ) + 4.00 ) * qtdFrango
 * 
 *  Saidas:
 *  gastoTotalGranja
 * 
 *  Testes:
 *  gastoTotalGranja =  (double) ( ( 3.50 * 2 ) + 4.00 ) * 625 = 6875.0
 *  gastoTotalGranja = (double) ( ( 3.50 * 2 ) + 4.00 ) * 84 = 924.0
 * 
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        double anelDireito = 4.00;
        double anelEsquerdo = 3.50;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de frangos: ");
        int qtdFrango = scanner.nextInt();

        double gastoTotalGranja = (double) ((anelEsquerdo * 2) + anelDireito) * qtdFrango;

        System.out.println("O gasto total para marcar " + qtdFrango + " é R$ " + gastoTotalGranja);

    }
}