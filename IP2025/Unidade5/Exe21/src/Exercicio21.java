import java.text.DecimalFormat;

public class Exercicio21 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double alturaZe = 1.10;
        double alturaChico = 1.50;
        int ano = 0;

        while (alturaZe < alturaChico) {
            alturaZe = alturaZe + 0.3;
            alturaChico = alturaChico + 0.2;
            ano++;
        }

        System.out.println("Altura zé: " + df.format(alturaZe));
        System.out.println("Altura chico: " + df.format(alturaChico));
        System.out.println("Ano: " + ano);

    }

}
