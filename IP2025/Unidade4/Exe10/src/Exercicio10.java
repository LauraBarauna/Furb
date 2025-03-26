/* 
 *  Entradas : 
 *  idade1
 *  idade2
 *  idade3
 *
 *  Processos: 
 *  se idade1 for menor que idade 2 e menor que idade 3, esse será o filho(a) caçula
 *  ou se idade2 for menor que idade 1 e menor que idade 3, esse será o filho(a) caçula
 *  ou se idade3 for menor que idade 1 e menor que idade 2, esse será o filho(a) caçula
 * 
 * 
 *  Saidas:
 *  A menor idade vai imprime -> "(nome do filgo(a)) é o caçula"
 * 
 *  Testes:
 *  idade1 = 22 (Marquinhos)
 *  idade2 = 11 (Zezinho)
 *  idade3 = 18 (Luluzinha)
 *  "O Zezinho é o caçula"
 * 
*/


import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade de Marquinhos: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite a idade de Zezinho: ");
        int idade2 = scanner.nextInt();

        System.out.println("Digite a idade de Luluzinha: ");
        int idade3 = scanner.nextInt();

        if(idade1 < idade2 && idade1 < idade3) {
            System.out.println("O Marquinhos é o caçula");
        } else if (idade2 < idade1 && idade2 < idade3) {
            System.out.println("O Zezinho é o caçula");
        } else if (idade3 < idade1 && idade3 < idade2) {
            System.out.println("A Luluzinha é o caçula");
        }

    }
}