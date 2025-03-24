/* 
 *  Entradas : 
 *  double valor
 *
 *  Processos: 
 *  valor = (valor * 100) % 100 para pegar apenas as casas decimais
 *  se o valor for maior que 0, imprime "Casas decimais foram digitadas"
 *  ou se o valor for igual a 0, imprime "Casas decimais não foram digitadas"
 * 
 *  Saidas:
 *  Casas decimais foram digitadas ou Casas deciamis não foram digitadas
 * 
 *  Testes:
 *  valor = 5.81
 *  Casas decimais foram digitadas
 * 
 *  valor = 4.0
 *  Casas decimais não foram digitadas
 * 
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número maior que 0 com ou sem casa decimais: ");
        double valor = scanner.nextDouble();

        valor = (valor * 100) % 100;

        if(valor > 0) {
            System.out.println("Casas decimais foram digitadas.");
        } else {
            System.out.println("Casas decimais não foram digitadas.");
        }

        scanner.close();
    }
}