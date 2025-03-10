/* 
 *  Entradas : 
 *  int dolaresCliente
 *  double cotacaoDolar
 *
 *  Processos: 
 *  double converterDolarParaReais = (double) dolaresCliente * cotacaoDolar
 * 
 *  Saidas:
 *  converterDolarParaReais
 * 
 *  Testes:
 *  converterDolarParaReais = (double) 440 * 5.65 = 2486.0
 * 
*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dolar do cliente: ");
        int dolaresCliente = scanner.nextInt();

        System.out.println("Digite a cotação do dolar no dia de hoje: ");
        double cotacaoDolar = scanner.nextDouble();

        double converterDolarParaReais = (double) dolaresCliente * cotacaoDolar;

        System.out.println("O atendente deve devolver R$ " + converterDolarParaReais + " para o cliente.");

    }
}