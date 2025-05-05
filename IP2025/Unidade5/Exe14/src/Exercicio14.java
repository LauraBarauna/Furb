import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lucroMenor10 = 0;
        int lucroEntre10E20 = 0;
        int lucroMaior20 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Nome da " + (i+1) + "º mercadoria: ");
            String nome = sc.nextLine();
            System.out.println("Preço de compra da mercadoria " +nome + ": ");
            double PC = sc.nextDouble();
            System.out.println("Preço de venda da mercadoria " +nome + ": ");
            double PV = sc.nextDouble();
            double percentual = ((PV - PC) / PC) * 100;

            if (percentual < 10.00) {
                lucroMenor10++;
            } else if (percentual >= 10.00 && percentual <= 20.00) {
                lucroEntre10E20++;
            } else if (percentual > 20.00) {
                lucroMaior20++;
            }

            System.out.println("Preço de Compra da mercadoria " +nome + ": " + PC);
            System.out.println("Preço de Venda da mercadoria " +nome + ": " + PV);
            System.out.println("Luco da mercadoria " +nome + ": " + percentual);
            sc.nextLine();
            System.out.println();

        }

        sc.close();

        System.out.println("Lucro Menor 10%: " + lucroMenor10);
        System.out.println("Lucro Entre 10% E 20%: " + lucroEntre10E20);
        System.out.println("Lucro Maior 20%: " + lucroMaior20);
    }
}
