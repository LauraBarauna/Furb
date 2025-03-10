/* 
 *  Entradas : 
 *  int nota1
 *  int nota2
 *  int nota3
 * 
 *  Processos: 
 *  double mediaPonderada = (double) ((5 * nota1) + (3 * nota2) + (2 * nota3 )) + ( 5 + 3 + 2 )
 * 
 *  Saidas:
 *  mediaPonderada
 * 
 *  Testes:
 *  mediaPonderada = ((5 * 9) + (3 * 6) + (2 * 8)) / (5 + 3 + 2) = 7.9
 *  mediaPonderada = ((5 * 4) + (3 * 8) + (2 * 6)) / (5 + 3 + 2) = 5.6
*/

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digte a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        double mediaPonderada = (double) ( (5 * nota1) + (3 * nota2) + (2 * nota3)) / (5 + 3 + 2);

        System.out.println("A média do alune é de: " + df.format(mediaPonderada));
        
    }
}