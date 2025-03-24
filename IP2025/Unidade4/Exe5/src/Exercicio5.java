/* 
 *  Entradas : 
 *  double resposta
 *
 *  Processos: 
 *  se resposta for true, imprime "Sim"
 *  e se resposta for false, imrpime "Não"
 * 
 *  Saidas:
 *  "Sim" ou "Não"
 * 
 *  Testes:
 *  resposta = true -- "Sim"
 *  resposta = false -- "Não"
 * 
*/


import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul? ");
        boolean resposta = scanner.nextBoolean();

        if(resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        scanner.close();

    }
}