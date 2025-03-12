/* 
 *  Entradas : 
 *  int valorCompra
 *  int valorDadoCliente
 *
 *  Processos: 
 *  int troco = valorDadoCliente - valorCompra
 *  int qtdNotas100 = troco / 100
 *  int resto = troco % 100
 *  int qtdNotas10 = resto / 10
 *  resto = resto % 10
 *  int qtdMoedas1 = resto
 *  int qtdNotas = qtdNotas100 + qtdNotas10 + qtdMoedas1
 * 
 *  Saidas:
 *  qtdNotas
 *  qtdNotas100
 *  qtdNotas10
 *  qtdMoedas1
 * 
 *  Testes:
 *  int troco = 1258 - 1300 = 42
 *  int qtdNotas100 = 42 / 100 = 0
 *  int resto = 42 % 100 = 42
 *  int qtdNotas10 = 42 / 10 = 4
 *  resto = 42 % 10 = 2
 *  int qtdMoedas1 = 2
 *  int qtdNotas = 0 + 4 + 2 = 6
 * 
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        int valorCompra = scanner.nextInt();

        System.out.println("Digite o valor dado pelo cliente: ");
        int valorDadoCliente = scanner.nextInt();

        int troco = valorDadoCliente - valorCompra;

        int qtdNotas100 = troco / 100;
        int resto = troco % 100;

        int qtdNotas10 = resto / 10;
        resto = resto % 10;

        int qtdMoedas1 = resto;

        int qtdNotas = qtdNotas100 + qtdNotas10 + qtdMoedas1;

        System.out.println("O número mínimo de notas de troco é: " + qtdNotas);
        System.out.println("Quantidade de notas de 100 necessárias é: " + qtdNotas100);
        System.out.println("Quantidade de notas de 10 necessárias é: " + qtdNotas10);
        System.out.println("Quantidade de moedas de 1 necessárias é: " + qtdMoedas1);


    }
}