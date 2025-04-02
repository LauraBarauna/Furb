/* 
 *  Entradas : 
 *  valor1
 *  valor2
 *  valor3
 *  opcao
 *  
 *
 *  Processos: 
 *  se valor1 for maior que valor2 e valor3, o maior numero sera o valor1. Se valor2 for maior que valor3 numero menor sera valor3 e numero do meio sera valor2
 *  e segue essa lógica pra todas as possibilidades
 *  
 *  se a opcao for 1 imrpime os valores em ordem crescente
 *  se a opcao for 2 imprime os valores em ordem decrescente
 *  se a opcao for 3 imprime os valores de forma que o maior valor fique no meio
 *  se a opcao for diferente de 1,2 ou 3 imprime Opção Inválida
 * 
 * 
 *  Saidas:
 *  numeros em ordem crescente
 *  numeros em ordem decrescente
 *  numeors de forma que o maior valor fique no meio
 * 
*/


import java.util.Scanner;

public class Exercicio24 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMaior = 0;
        int numMenor = 0;
        int numMeio = 0;

        System.out.println("Valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.println("Valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.println("Valor 3: ");
        int valor3 = scanner.nextInt();

        System.out.println("Opção 1 - valores em crescente; 2 - valores em ordem decrescente; 3 - valores de forma que o maior valor fique no meio: ");
        int opcao = scanner.nextInt();

        
        if (valor1 > valor2 && valor1 > valor3) {
            numMaior = valor1;
            if (valor2 > valor3) {
                numMenor = valor3;
                numMeio = valor2;
            } else {
                numMenor = valor2;
                numMeio = valor3;
            }
        }

        if (valor2 > valor1 && valor2 > valor3) {
            numMaior = valor2;
            if (valor1 > valor3) {
                numMenor = valor3;
                numMeio = valor1;
            } else {
                numMenor = valor1;
                numMeio = valor3;
            }
        }

        if (valor3 > valor1 && valor3 > valor2) {
            numMaior = valor3;
            if (valor1 > valor2) {
                numMenor = valor2;
                numMeio = valor1;
            } else {
                numMenor = valor1;
                numMeio = valor2;
            }
        }

        
        switch (opcao) {
            case 1:
                System.out.println(numMenor + " " + numMeio + " " + numMaior); 
                break;
            case 2:
                System.out.println(numMaior + " " + numMeio + " " + numMenor); 
                break;
            case 3:
                System.out.println(numMeio + " " + numMaior + " " + numMenor); 
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
