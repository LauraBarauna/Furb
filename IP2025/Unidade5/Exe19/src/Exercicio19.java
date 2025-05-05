import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorFinal = 0;
        double valorTotal = 0;

        while(true){
            System.out.println("Valor da compra: ");
            double valor = sc.nextDouble();

            if(valor == 0){
                System.out.println("O valor total recebido foi de: R$ " + df.format(valorTotal));
                break;
            }

            if (valor > 500.00){
                valorFinal = valor - ((double) 20 / 100 * valor);
            } else if (valor <= 500.00) {
                valorFinal = valor - ((double) 15 / 100 * valor);
            }

            valorTotal += valorFinal;

            System.out.println("Valor a pagar: R$ " + df.format(valorFinal));
        }
    }
}
