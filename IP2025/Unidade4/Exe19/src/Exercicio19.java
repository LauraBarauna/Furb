/* 
 *  Entradas : 
 *  x
 *  y
 *
 *  Processos: 
 *  Quadrante 0 quando x e y for igual a 1
 *  Quadrante 1 quando x e y forem positivos
 *  Quadrante 2 quando x é negativo e y positivo
 *  Quadrante 3 quando x e y negativos
 *  Quadrante 4 quando x positivo e y negativo
 * 
 * 
 *  Saidas:
 *  Quadrante 0
 *  Quadrante 1
 *  Quadrante 2
 *  Quadrante 3
 *  Quadrante 4
 * 
 *  Testes:
 *  x = -5
 *  y = 10
 *  Quadrante 2
 * 
*/


import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("x = ");
        int x = scanner.nextInt();
        
        System.out.println("y = ");
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        }

    }
}