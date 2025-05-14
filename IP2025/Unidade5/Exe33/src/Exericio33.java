import java.text.DecimalFormat;
import java.util.Scanner;

class Exericio33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        int voto;
        int votosTotal = 0;
        int votosMaria = 0;
        int votosPimentinha = 0;
        int votosLenom = 0;
        int votosSafira = 0;
        int votosNulo = 0;
        int votosBranco = 0;


        do { 

            System.out.println("Escolha um voto: ");
            System.out.println("1 - Maria Joaquinha");
            System.out.println("2 - Nilton Pimentinha");
            System.out.println("3 - Lenom Braga");
            System.out.println("4 - Safira Lages");
            System.out.println("5 - Nulo");
            System.out.println("6 - Branco");
            System.out.println("0 - Sair");
            voto = sc.nextInt();

            votosTotal++;
            
            switch (voto) {
                case 1:
                votosMaria++;
                    break;
                case 2:
                    votosPimentinha++;
                    break;
                case 3:
                    votosLenom++;
                    break;
                case 4:
                    votosSafira++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Saindo...");
                    break;    
                default:
                    System.out.println();
                    System.out.println("Esse número de voto não existe!");
                    System.out.println();
                    continue;
            }

            System.out.println();

            
        } while (voto != 0);

        System.out.println("Votos totais: " +votosTotal);

        System.out.println("Votos Maria Joaquina: " +votosMaria);
        System.out.println("Votos Nilton Pimentinha: " +votosPimentinha);
        System.out.println("Votos Lenom Braga: " +votosLenom);
        System.out.println("Votos Safira Lages: " +votosSafira);
        System.out.println("Votos Nulos: " +votosNulo);
        System.out.println("Votos Brancos: " +votosBranco);

        double percentualVotosBranco = (double) (100 * votosBranco) / votosTotal;
        double percentualVotosNulos = (double) (100 * votosNulo) / votosTotal;

        System.out.println("Percentual votos brancos: " +df.format(percentualVotosBranco)+" %");
        System.out.println("Percentual votos nulos: " +df.format(percentualVotosNulos)+" %");

    }
}