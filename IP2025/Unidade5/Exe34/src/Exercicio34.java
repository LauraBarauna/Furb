
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int opcao;

        int qtdDiarias;
        double valorDiaria;

        int qtdContasEncerradas = 0;

        do {

            System.out.println("Escolha uma opção:");
            System.out.println();
            System.out.println("1 - Encerrar conta do hóspede");
            System.out.println("2 - Verificar contas encerradas");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            sc.nextLine();

            switch (opcao) {
                case 1:

                    qtdContasEncerradas++;

                    System.out.println("Nome do hóspede: ");
                    String nomeHospede = sc.nextLine();

                    System.out.println("Número de diárias: ");
                    qtdDiarias = sc.nextInt();
                    sc.nextLine();

                    if (qtdDiarias < 15) {
                        valorDiaria = 7.50 * qtdDiarias;
                    } else if (qtdDiarias == 15) {
                        valorDiaria = 6.50 * qtdDiarias;
                    } else {
                        valorDiaria = 5.00 * qtdDiarias;
                    }

                    System.out.println();

                    System.out.println("Nome do hóspede: " + nomeHospede);

                    System.out.println("O hóspede " + nomeHospede + " precisa pagar " + df.format(valorDiaria) + " reais.");

                    break;
                case 2:
                    System.out.println();
                    System.out.println("Quantidade de hóspedes que deixaram o hotel: " + qtdContasEncerradas);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida! Digite novamente!");
                    continue;
            }

            System.out.println();

        } while (opcao != 3);

    }
}
