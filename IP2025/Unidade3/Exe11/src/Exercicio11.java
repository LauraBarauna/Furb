/* 
 *  Entradas : 
 *  double temperaturaC
 *
 *  Processos: 
 *  double temperaturaF = (9.0 / 5.0) * temperaturaC + 32
 * 
 *  Saidas:
 *  temperaturaF
 * 
 *  Testes:
 *  double temperaturaF = (9.0 / 5.0) * 2 + 32 = 35.60
 * 
*/


import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a temperautra em °C: ");
        double temperaturaC = scanner.nextDouble();

        double temperaturaF = (9.0 / 5.0) * temperaturaC + 32;

        System.out.println(temperaturaF);

        scanner.close();

    }
}