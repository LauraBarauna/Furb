import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPessoasAssistindo = 0;

        int pessoasAssistindo4 = 0;
        int pessoasAssistindo5 = 0;
        int pessoasAssistindo9 = 0;
        int pessoasAssistindo12 = 0;

        while (true) {
            System.out.println("CANAL: ");
            int canal = sc.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.println("Pessoas assistindo: ");
            int pessoasAssistindo = sc.nextInt();

            totalPessoasAssistindo += pessoasAssistindo;


            switch (canal) {
                case 4:
                    pessoasAssistindo4 = pessoasAssistindo;
                    break;
                case 5:
                    pessoasAssistindo5 = pessoasAssistindo;
                    break;
                case 9:
                    pessoasAssistindo9 = pessoasAssistindo;
                    break;
                case 12:
                    pessoasAssistindo12 = pessoasAssistindo;
                    break;
                default:
                    System.out.println("Canal não encontrado!");
                    break;
            }

        }

        int percentualCanal4 = (int) ((100 * pessoasAssistindo4) / totalPessoasAssistindo);
        int percentualCanal5 = (int) ((100 * pessoasAssistindo5) / totalPessoasAssistindo);
        int percentualCanal9 = (int) ((100 * pessoasAssistindo9) / totalPessoasAssistindo);
        int percentualCanal12 = (int) ((100 * pessoasAssistindo12) / totalPessoasAssistindo);

        System.out.println("Percentual de audiência do canal 4: " + percentualCanal4 + "%");
        System.out.println("Percentual de audiência do canal 5: " + percentualCanal5 + "%");
        System.out.println("Percentual de audiência do canal 9: " + percentualCanal9 + "%");
        System.out.println("Percentual de audiência do canal 12: " + percentualCanal12 + "%");


    }
}


