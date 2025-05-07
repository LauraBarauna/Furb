import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double limiteKg = 0;
        double pesoTotalPeixesEmKg = 0;

        System.out.println("Qual o limite diário em KG? ");
        limiteKg = sc.nextDouble();

        sc.nextLine();

        while (true) {

            if (pesoTotalPeixesEmKg >= limiteKg) {
                System.out.println("Limite diário excedido");
                break;
            }

            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            String peso = sc.nextLine().toUpperCase();

            if (peso.equals("N")) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Qual o peso do peixe em gramas? ");
            double pesoPeixesGramas = sc.nextDouble();

            pesoTotalPeixesEmKg += pesoPeixesGramas / 1000;

            System.out.println("Peso total em KG da pesca obtido até agora: " + df.format(pesoTotalPeixesEmKg));


            sc.nextLine();
            System.out.println();


        }
    }
}
