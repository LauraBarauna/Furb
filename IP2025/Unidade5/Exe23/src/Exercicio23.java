import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String opcao = " ";

        while (true) {
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            opcao = sc.nextLine().toUpperCase();

            if (opcao.equals("N")) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Nome do vendedor: ");
            String nome = sc.nextLine(); // Agora vai funcionar!

            System.out.println("Total de vendas: ");
            int totalVendas = sc.nextInt();

            System.out.println("Total de vendas em R$: ");
            double totalVendasReais = sc.nextDouble();

            double salario = (totalVendasReais * 30) / 100;

            sc.nextLine();

            System.out.println();

            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: " + totalVendas);
            System.out.println("Salário: R$" + df.format(salario));

            System.out.println();
        }

    }
}
