/* 
 *  Entradas : 
 *  int horasMes
 *  double horasValor
 *
 *  Processos: 
 *  double salarioTotal =  (double) horasMes * horasValor 
 * 
 *  se a horaMes for maior que 160 calculamos o valor a mais
 *  double salarioExtra = (double) (horasMes - 160) * (horasValor / 2)
 *  salarioTotal = (double) salarioTotal + salarioExtra
 * 
 *  Saidas:
 *  salarioTotal
 * 
 *  Testes:
 *  double salarioTotal =  180 * 35 = 6300
 *  
 *  180 é maior que 160, então:
 *  double salarioExtra = (180 - 160) * (35 / 2) = 350
 *  salarioTotal = 6300 + 350 = 6650,00
 * 
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        int horasMes = scanner.nextInt();

        System.out.println("Entre com o valor pago por hora: ");
        double horasValor = scanner.nextDouble();

        double salarioTotal = (double) horasMes * horasValor;

        if(horasMes > 160) {
            double salarioExtra = (double) (horasMes - 160) * (horasValor / 2);
            salarioTotal = (double) salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é: " + salarioTotal);

    }
}
