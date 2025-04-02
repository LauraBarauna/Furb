/* 
 *  Entradas : 
 *  escolha
 *
 *  Processos: 
 *  se escolha for igual a 1 imprime Bacharel em Ciência da Computação
 *  se escolha for igual a 2 imprime Licenciado em Computação
 *  se escolha for igual a 3 imprime Bacharel em Sistemas de Informação
 * 
 *  Saidas:
 *  Bacharel em Ciência da Computação
 *  Licenciado em Computação
 *  Bacharel em Sistemas de Informação
 * 
*/


import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha: ");
        System.out.println("1 - Ciência da Computação, 2 - Licenciatura da Computação e 3 - Sistemas de Informação");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        }

        scanner.close();

    }
}