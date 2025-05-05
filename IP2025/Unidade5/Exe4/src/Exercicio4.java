
import java.text.DecimalFormat;

public class Exercicio4 {

    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double numerador = 3.0;
        int denominador = 2;
        double soma = 0;
        int adicao = 4;

        for (int i = 0; i < 5; i++) {
            soma += (double) (numerador / denominador);
            numerador += 2;
            denominador += adicao;
            adicao += 2;
        }

        System.out.println("Resultado: " + df.format(soma));
    }
}