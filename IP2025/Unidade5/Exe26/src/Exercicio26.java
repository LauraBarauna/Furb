
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pedagiosNegados = 0;
        int pedagiosAceitosAcima150Km = 0;
        int qtdPedagios = 0;


        System.out.println("Valor máximo pedágio: ");
        double valorMaximoPedagio = sc.nextDouble();

        sc.nextLine();

        while (true) { 

            System.out.println("Valor pedágio: ");
            double pedagio = sc.nextDouble();

            if (pedagio < 0) {
                System.out.println("Trechos com valor acima do qual ele nega-se a pagar: " + pedagiosNegados);
                System.out.println("Quantidade de trechos informados: " + qtdPedagios);
                System.out.println("Trechos acima de 150km com valor aceito por ele: " + pedagiosAceitosAcima150Km);
                break;
            }

            System.out.println("Distância: ");
            double distanciaKm = sc.nextDouble();

            if(pedagio <= valorMaximoPedagio && distanciaKm > 150) {
                pedagiosAceitosAcima150Km++;
            }

            if (pedagio > valorMaximoPedagio) {
                pedagiosNegados++;
            }

            qtdPedagios++;

        }
    }
}
