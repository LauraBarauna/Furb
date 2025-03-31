/* 
 *  Entradas : 
 *  carta1
 *  carta2
 *  carta3
 *
 *  Processos: 
 *  sera truco quando uma das 3 cartas for uma carta boa
 *  sera seis quando duas das 3 cartas for uma carta boa
 *  sera nove quando três das 3 cartas for uma carta boa
 *  uma carta boa é 1, 2, 3
 *  
 *  se nenhuma das cartas forem boas, não imprime nada
 * 
 * 
 *  Saidas:
 *  TRUCO, SEIS, NOVE ou nada
 * 
 *  Testes:
 *  carta1 = 1
 *  carta2 = 4
 *  carta3 = 7
 *  TRUCO
 *  
 *  
 * 
*/


import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as 3 cartas: ");
        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();
        int carta3 = scanner.nextInt();

        int qtdCartasBoas = 0;

        if(carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoas++;
        } 
        
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoas++;
        } 
        
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoas++;
        }

        if(qtdCartasBoas == 1){
            System.out.println("TRUCO");
        } else if (qtdCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qtdCartasBoas == 3) {
            System.out.println("NOVE");
        }

    }
}