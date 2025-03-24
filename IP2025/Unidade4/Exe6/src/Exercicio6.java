/* 
 *  Entradas : 
 *  char sexo
 *
 *  Processos: 
 *  se o sexo for f ou F, imprime Feminino
 *  ou se o sexo for m ou M, imprime Masculino
 *  ou se o sexo for i ou I, imprime Não informado
 *  e se o sexo for outra letra, imprime Entrada incorreta
 * 
 *  Saidas:
 *  se o sexo for f ou F, imprime Feminino
 *  ou se o sexo for m ou M, imprime Masculino
 *  ou se o sexo for i ou I, imprime Não informado
 *  e se o sexo for outra letra, imprime Entrada incorreta
 * 
 *  Testes:
 *  char sexo = f - Feminino
 *  char sexo = i - Não informado
 *  char sexo = M - Masculino
 *  char sexo = w - Entrada incorreta
 * 
*/


import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu sexo: ");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'i' || sexo == 'I') {
            System.out.println("Não informado");
        } else if (sexo == 'M' || sexo == 'm') {
            System.out.println("Masculino");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Feminino");
        } else {
            System.out.println("Entada incorreta");
        }

        scanner.close();

    }
}