/* 
 *  Entradas : 
 *  int catetoOposto
 *  int catetoAdjente
 *
 *  Processos: 
 *  double hipotenusa = (double) Math.sqrt((catetoOposto * catetoOposto) + (catetoAdjente * catetoAdjente))
 * 
 *  Saidas:
 *  hipotenusa
 * 
 *  Testes:
 *  hipotenusa = (double) Math.sqrt((3 * 3) + (4 * 4)) = 5.00
 *  hipotenusa = (double) Math.sqrt((5 * 5) + (12 * 12)) = 13.00
 * 
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do cateto oposto");
        int catetoOposto = scanner.nextInt();

        System.out.println("Digite o valor do cateto adjente");
        int catetoAdjente = scanner.nextInt();


        double hipotenusa = (double) Math.sqrt((catetoOposto * catetoOposto) + (catetoAdjente * catetoAdjente));

        System.out.println("A hipotenusa é: " + hipotenusa);

    }
}
