/* 
 *  Entradas : 
 *  altura
 *  massa
 *
 *  Processos: 
 *  IMC = (double) massa / (altura * altura);
 *  se IMC for menor que 18.5 é Magreza
 *  se IMC for maior ou igual 18.5 e menor ou igual a 24.9 é Saudável
 *  se IMC for maior ou igual 25.0 e menor ou igual a 29.9 é Sobrepeso
 *  se IMC for maior ou igual 30.0 e menor ou igual a 34.9 é Obesidade Grau I
 *  se IMC for maior ou igual 35.0 e menor ou igual a 39.9 é Obesidade Grau II (severa)
 *  se IMC for maior ou igual 40.0 é Obesidade Grau III (móbida)
 * 
 *  Saidas:
 *  Saudável
 *  Sobrepeso
 *  Obesidade Grau I
 *  Obesidade Grau II (severa)
 *  Obesidade Grau III (móbida)
 * 
 * 
*/


import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Massa: ");
        int massa = scanner.nextInt();

        double IMC = (double) massa / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Magreza");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Saudável");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC >= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }
    }
}