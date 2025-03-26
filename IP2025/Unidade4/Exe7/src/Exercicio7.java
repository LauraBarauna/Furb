/* 
 *  Entradas : 
 *  double peso
 *
 *  Processos: 
 *  se o peso for <= 50 o valor a pagar será de 0.45
 *  se o peso for > 50 as cartas pagam um adicional de 0.45 por cada 20 gramas, ou fração, em que excedem
 *  aquele peso.
 * 
 *  Saidas:
 *  se peso for = 50, valorPagar será de 0.45
 *  se peso for = 105, valorPagar será de 2.1375
 * 
 *  Testes:
 *  peso = 50 - valorPagar = 0.45
 *  peso = 105 - valorPagar = 2.1375
 * 
*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o peso da carta: ");
        double peso = scanner.nextDouble();

        double valorPagar = 0;

        if(peso <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExecedido = peso - 50;
            double qtAdicional = (pesoExecedido / 20) + 1;
            valorPagar = 0.45 + (0.45 * qtAdicional);
        }

        System.out.println("Custo do selo " + valorPagar);

    }
}