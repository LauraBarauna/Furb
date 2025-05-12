import java.util.Scanner;

class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dia da semana que cai o primeiro dia do mês: ");
        int diaSemanaPrimeiroDia = sc.nextInt();

        System.out.println("Quantidade de dias do mês: ");
        int diasDoMes = sc.nextInt();

        int diaAtual = 1;
        int qtdDiasPrimeiraSemana = 0;
        int loop = 0;

        switch (diaSemanaPrimeiroDia) {
            case 1:
                qtdDiasPrimeiraSemana = 7;
                break;
            case 2:
                qtdDiasPrimeiraSemana = 6;
                break;
            case 3:
                qtdDiasPrimeiraSemana = 5;
                break;
            case 4:
                qtdDiasPrimeiraSemana = 4;
                break;
            case 5:
                qtdDiasPrimeiraSemana = 3;
                break;
            case 6:
                qtdDiasPrimeiraSemana = 2;
                break;
            case 7:
                qtdDiasPrimeiraSemana = 1;
                break;
            default:
                System.out.println("Valor inválido!");;
        }

        while (diaAtual <= diasDoMes) {

            if (loop == 0) {
                for(int i = 0; i < qtdDiasPrimeiraSemana; i++) {
                    System.out.print(diaAtual++ + " ");
                }
            } else {
                for(int i = 0; i < 7; i++) {

                    if(diaAtual > diasDoMes) {
                        break;
                    }
                    System.out.print(diaAtual++ + " ");
                }
            }

            System.out.println();
            loop++;
        }

    }
}