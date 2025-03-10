/* 
 *  Entradas : 
 *  double precoLitro
 *  double valorPagamento
 * 
 *  Processos: 
 *  double qtdLitros = valorPagamento / precoLitro
 * 
 *  Saidas:
 *  qtdLitros
 * 
 *  Testes:
 *  qtdLitros = 150,00 / 5,75 = 26.09
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.println("Digite o valor do pagamento: ");
        double valorPagamento = scanner.nextDouble();

        double qtdLitros = valorPagamento / precoLitro;

        System.out.println("O motorista conseguiu colocar: " + df.format(qtdLitros) + " litros.");

        scanner.close();

    }
}