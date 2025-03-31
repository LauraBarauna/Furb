/* 
 *  Entradas : 
 *  mes
 *
 *  Processos: 
 *  se mes for maior que 0 e menor ou igual a 12, o funcionário vai receber 5% de reajuste
 *  se mes for maior que 12 e menor ou igual a 28, o funcionário vai receber 7% de reajuste
 *  se mes não for nada desse, o reajuste não é informado
 * 
 * 
 *  Saidas:
 *  O funcionário vai receber 5% de reajuste
 *  O funcionário vai receber 7% de reajuste
 *  Reajuste não informado
 * 
 *  Testes:
 *  mes = 10
 *  O funcionário vai receber 5% de reajuste
 * 
*/


import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a admissão: ");
        int mes = scanner.nextInt();

        if (mes > 0 && mes <= 12) {
            System.out.println("O funcionário ira receber 5% de reajuste");
        } else if (mes >= 13 && mes <= 48) {
            System.out.println("O funcionário ira receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }

    }
}
