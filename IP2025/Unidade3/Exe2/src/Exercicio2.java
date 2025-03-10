/* 
 *  Entradas : int precoProduto
 * 
 *  Processos: 
 *  int valorDesconto = (precoProduto * desconto) / 100
 *  int produtoComDesconto = precoProduto - valorDesconto
 * 
 *  Saidas:
 *  O valor de desconto é de R$ valoDesconto
 *  O preço do par de sapatos com desconot é R$ produtoComDesconto
 * 
 *  Testes:
 *  int valorDesconto = (100 * 12) / 100 = 12
 *  int produtoComDesconto = 100 - 12 = 88
 * 
 *  int valorDesconto = (129 * 12) / 100 = 15.48
 *  int produtoComDesconto = 129 - 15.48 = 113.52
 * 
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        double desconto = 12;

        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double precoProduto = scanner.nextDouble();

        double valorDesconto =  (precoProduto * desconto) / 100;
        double produtoComDesconto =  precoProduto - valorDesconto;

        System.out.println("O valor do desconto é de R$" + df.format(valorDesconto));
        System.out.println("O preço do par de sapatos com desconto é R$" + df.format(produtoComDesconto));

        scanner.close();

    }
}
