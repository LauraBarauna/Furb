import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Número total de reabastecimentos: ");
        int reabastecimentos = sc.nextInt();
        double kmLitro = 0.0;
        double media = 0.0;


        for (int i = 1; i <= reabastecimentos; i++) {
            System.out.println("Parada " + i + ": ");
            System.out.println("Quilometragem: ");
            int quilometragem = sc.nextInt();
            System.out.println("Combustivel: ");
            int combustivel = sc.nextInt();
            kmLitro = (double) quilometragem / combustivel;
            System.out.println("Parada " + i + ": " + kmLitro + " km por litro");
            media += kmLitro;
        }


        media = media / reabastecimentos;
        System.out.println("Quilometragem média obtida por litro: " + df.format(media));

    }
}
