import java.util.Scanner;

public class Exercicio16 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        // Ml
        int lata = 350;
        int garrafa600 = 600;
        int garrafa2000 = 2000;

        int escolhaLata = 0;
        int escolhaGarrafa600 = 0;
        int escolhaGarrafa2000 = 0;

        char continuarComprando = 's';

        while (continuarComprando == 's' || continuarComprando == 'S') {

            System.out.println("Bem vindo(a)! Essas são nossas bebidas: ");
            System.out.println(" 300 - Lata (300ml) ");
            System.out.println(" 600 - Garrafa (600ml) ");
            System.out.println(" 2000 - Garrafa (2L) ");

            System.out.println();

            System.out.println("Qual desses você gostaria de encomendar: ");
            int escolha = scanner.nextInt();

            if (escolha < 300 || escolha > 2000) {
                System.out.println();
                System.out.println("Não temos essa escolha disponível! Tente novamente!");
                continue;
            }

            switch (escolha) {
                case 300:
                    escolhaLata++;
                    break;
                case 600:
                    escolhaGarrafa600++;
                    break;
                case 2000:
                    escolhaGarrafa2000++;
                    break;
            }

            System.out.println("Gostaria de adicionar mais produtos? (s) (n) ");
            continuarComprando = scanner.next().charAt(0);
            System.out.println();
        }

        lata = lata * escolhaLata;
        garrafa600 = garrafa600 * escolhaGarrafa600;
        garrafa2000 = garrafa2000 * escolhaGarrafa2000;

        int totalMl = lata + garrafa600 + garrafa2000;
        double totalL = (double) totalMl / 1000;

        System.out.println("Suas bebidas totais deram uma quantiade de " + totalL + " litros");





    }
}
