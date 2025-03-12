/* 
 *  Entradas : 
 *  int numero
 *
 *  Processos: 
 *  int centenas = numero / 100
 *  int resto = numero % 100
 *  int dezenas = resto / 10
 *  resto = numero % 10
 *  int unidades = resto
 * 
 *  Saidas:
 *  centenas
 *  dezenas
 *  unidades
 * 
 *  Testes:
 *  int centenas = 816 / 100 = 8
 *  int resto = 816 % 100 = 16
 *  int dezenas = 16 / 10 = 1
 *  resto = 16 % 10 = 6
 *  int unidades = 6
 * 
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        int resto = numero % 100;

        int dezenas = resto / 10;
        resto = resto % 10;

        int unidades = resto;

        System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s).");


    }
}