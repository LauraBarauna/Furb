import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double atletaMaisBaixo = 3.0;
        int inscricaoMaisBaixo = 0;

        double atletaMaisAlto = 0;
        int inscricaoMaisAlto = 0;

        double soma = 0;
        double media = 0;
        double qtdAtletas = 0;

        while (true) {
            System.out.println("Nº de inscrição: ");
            int numInscricao = sc.nextInt();

            if (numInscricao == 0) {
                System.out.println("O atleta mais baixo tem " + atletaMaisBaixo + " e o seu número de inscrição é: " +inscricaoMaisBaixo);
                System.out.println("O atleta mais alto tem " + atletaMaisAlto + " e o seu número de inscrição é: " +inscricaoMaisAlto);
                System.out.println("A altura média do grupo de atletas é: " + df.format(media));
            }

            System.out.println("Altura: " );
            double altura = sc.nextDouble();

            sc.close();

            soma += altura;
            qtdAtletas++;
            media = soma / qtdAtletas;

            if (altura > atletaMaisAlto) {
                atletaMaisAlto = altura;
                inscricaoMaisAlto = numInscricao;

                if (altura < atletaMaisBaixo) {
                    atletaMaisBaixo = altura;
                    inscricaoMaisBaixo = numInscricao;
                }

            } else if (altura < atletaMaisBaixo) {
                atletaMaisBaixo = altura;
                inscricaoMaisBaixo = numInscricao;
            }


        }
    }
}
