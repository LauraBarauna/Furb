import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String genero = " ";

        double mediaMulheres = 0;
        int qtdMulheres = 0;
        double somaMulheres = 0;

        double mediaHomens = 0;
        int qtdHomens = 0;
        double somaHomens = 0;

        double mediaOutros = 0;
        int qtdOutros = 0;
        double somaOutros = 0;

        double somaGeral = 0;
        double mediaGeral = 0;

        while (true) {
            System.out.println("Digite um genero: ");
            genero = sc.nextLine().toUpperCase();

            if (genero.equals("0")) {
                if (qtdMulheres > 0) {
                    System.out.println("A média da altura das mulheres é: " + df.format(mediaMulheres));
                } else if (qtdHomens > 0) {
                    System.out.println("A média da altura dos homens é: " + df.format(mediaHomens));
                } else {
                    System.out.println("A média da altura dos outros é: " + df.format(mediaOutros));
                }
                System.out.println("A média de altura do grupo é: " + df.format(mediaGeral));
                break;
            }

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            sc.nextLine();

            switch (genero) {
                case "F":
                    qtdMulheres++;
                    somaMulheres += altura;
                    mediaMulheres = somaMulheres / qtdMulheres;
                    break;
                case "M":
                    qtdHomens++;
                    somaHomens += altura;
                    mediaHomens = somaHomens / qtdHomens;
                    break;
                case "O":
                    qtdOutros++;
                    somaOutros += altura;
                    mediaOutros = somaOutros / qtdOutros;
                    break;
            }

            somaGeral += altura;
            mediaGeral = somaGeral / (qtdMulheres + qtdHomens + qtdOutros);


        }
    }
}
