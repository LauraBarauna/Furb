/* 
 *  Entradas : 
 *  int anoNascimento1
 *  int anoNascimento2
 *  int anoNascimento3
 *
 *  Processos: 
 *  se anoNascimento1 for igual a anoNascimento2 e anoNascimento1 for igual anoNascimento3 
 *  e anoNascimento2 for igual a anoNascimento3, eles são trigêmos
 * 
 *  e se anoNascimento1 for igual a anoNascimento2 ou anoNascimento1 for igual a anoNascimento3 ou 
 *  anoNascimento2 for igual anoNascimento3, eles são gêmeos
 * 
 *  se não for nada dessas coisas, os três com anos de nascimento diferentes, são apenas irmãos
 * 
 *  Saidas: 
 *  TRIGÊMEOS OU GÊMEOS OU APENAS IRMÃOS
 * 
 *  Testes:
 *  anoNascimento1 = 10
 *  anoNascimento2 = 10
 *  anoNascimento3 = 10
 *  TRIGÊMEOS
 *  
 *  anoNascimento1 = 5
 *  anoNascimento2 = 10
 *  anoNascimento3 = 5
 *  GEMÊOS
 * 
 *  anoNascimento1 = 10
 *  anoNascimento2 = 5
 *  anoNascimento3 = 15
 *  APENAS IRMÃOS
 * 
*/


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro ano de nascimento: ");
        int anoNascimento1 = scanner.nextInt();

        System.out.println("Informe o segundo ano de nascimento: ");
        int anoNascimento2 = scanner.nextInt();

        System.out.println("Informe o terceiro ano de nascimento: ");
        int anoNascimento3 = scanner.nextInt();

        if(anoNascimento1 == anoNascimento2 && anoNascimento1 == anoNascimento3 && anoNascimento2 == anoNascimento3) {
            System.out.println("TRIGÊMEOS");
        } else if (anoNascimento1 == anoNascimento2 || anoNascimento1 == anoNascimento3 || anoNascimento2 == anoNascimento3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }

    }
}