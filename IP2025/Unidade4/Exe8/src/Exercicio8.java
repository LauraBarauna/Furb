/* 
 *  Entradas : 
 *  char letra
 *
 *  Processos: 
 *  se letra for igual a,e,i,o ou u imprime É vogal
 *  se não, imprime NÃO é vogal
 * 
 *  Saidas:
 *  se letra for igual a,e,i,o ou u imprime É vogal
 *  se não, imprime NÃO é vogal
 * 
 *  Testes:
 *  char letro = a -> É vogal
 *  char letra = M -> NÃO é vogal
 * 
*/


import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char letra = scanner.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }

    }
}