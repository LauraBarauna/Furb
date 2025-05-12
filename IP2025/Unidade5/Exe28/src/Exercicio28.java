
import java.util.Scanner;

class Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char opcao = 's';
        int codigo = 0;

        int qtd1 = 0;
        int qtd2 = 0;
        int qtd3 = 0;
        int qtd4 = 0;

        while (true) { 

            if(opcao == 'n' || opcao == 'N') {
                System.out.println("Quantidade de votos conjunto Nenhum de Nós (1): " +qtd1);
                System.out.println("Quantidade de votos conjunto CPM22 (2): " +qtd2);
                System.out.println("Quantidade de votos conjunto Skank (3): " +qtd3);
                System.out.println("Quantidade de votos conjunto Jota Quest (4): " +qtd4);

                System.out.println();

                int qtdTotal = qtd1 + qtd2 + qtd3 + qtd4;

                double percentualVotos1 = (qtd1 * 100) / qtdTotal;
                double percentualVotos2 = (qtd2 * 100) / qtdTotal;
                double percentualVotos3 = (qtd3 * 100) / qtdTotal;
                double percentualVotos4 = (qtd4 * 100) / qtdTotal;

                System.out.println("Percentual 1: " +percentualVotos1+"%");
                System.out.println("Percentual 2: " +percentualVotos2+"%");
                System.out.println("Percentual 3: " +percentualVotos3+"%");
                System.out.println("Percentual 4: " +percentualVotos4+"%");

                System.out.println();

                if(qtd1 > qtd2 && qtd1 > qtd3 && qtd1 > qtd4) {
                    System.out.println("Conjunto Nenhum de nós vencedor!");
                } else if (qtd2 > qtd1 && qtd2 > qtd3 && qtd2> qtd4) {
                    System.out.println("Conjunto CPM22 vencedor!");
                } else if (qtd3 > qtd1 && qtd3 > qtd2 && qtd3> qtd4) {
                    System.out.println("Conjunto Skank vencedor!");
                } else if (qtd4 > qtd1 && qtd4 > qtd2 && qtd4> qtd3) {
                    System.out.println("Conjunto Jota Quest vencedor!");
                }

                break;
            }

            System.out.println("Código: ");
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:
                    qtd1++;
                    break;
                case 2:
                    qtd2++;
                    break;
                case 3:
                    qtd3++;
                    break;
                case 4:
                    qtd4++;
                    break;
                default:
                    System.out.println("Rádio inexistente, digite de novo!");
                    continue;
            }

            

            System.out.println("Mais um voto? s (sim) n (não)");
            opcao = sc.next().charAt(0);

        }
    }
}