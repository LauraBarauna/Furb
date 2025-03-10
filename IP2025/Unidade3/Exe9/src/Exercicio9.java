/* 
 *  Entradas : 
 *  int raio
 *  int altura
 *
 *  Processos: 
 *  double volumeLataDeOleo = (double) 3.141592653589793 * (raio * raio) * altura;
 * 
 *  Saidas:
 *  volumeLataDeOleo
 * 
 *  Testes:
 *  volumeLataDeOleo = (double) 3.141592653589793 * (6 * 6) * 10 = 1130,97
 *  volumeLataDeOleo = (double) 3.141592653589793 * (12 * 12) * 12 = 5428,67
 * 
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        double pi = 3.141592653589793;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite o valor do raio: ");
        int raio = scanner.nextInt();

        System.out.println("Digite o valor da altura: ");
        int altura = scanner.nextInt();

        double volumeLataDeOleo = (double) pi * (raio * raio) * altura;
        
        System.out.println("O volume da lata de óleo é: " + df.format(volumeLataDeOleo));

        scanner.close();
    }
}