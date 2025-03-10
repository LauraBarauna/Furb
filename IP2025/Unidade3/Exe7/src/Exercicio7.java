/* 
 *  Entradas : 
 *  int qtd350Ml
 *  int qtd600Ml
 *  int qtd2L
 *
 *  Processos: 
 *  double totalLitros = (double) ((350 * qtd350Ml) + (600 * qtd600Ml) + (2000 * qtd2L)) / 1000
 * 
 *  Saidas:
 *  totalLitros
 * 
 *  Testes:
 *  totalLitros = (double) ((350 * 40) + (600 * 34) + (2000 * 120)) / 1000 = 274,4
 * 
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite a quantidade de refrigerantes de 350ml: ");
        int qtd350Ml = scanner.nextInt();

        System.out.println("Digite a quantidade de refrigerantes de 600ml: ");
        int qtd600Ml = scanner.nextInt();

        System.out.println("Digite a quantidade de refrigerantes de 2L: ");
        int qtd2L = scanner.nextInt();

        double totalLitros = (double) ((350 * qtd350Ml) + (600 * qtd600Ml) + (2000 * qtd2L)) / 1000;

        System.out.println("O cliente comprou ao total " + df.format(totalLitros) + " litros");

        scanner.close();

    }
}
