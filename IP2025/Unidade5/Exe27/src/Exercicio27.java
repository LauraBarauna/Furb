
import java.util.Scanner;

class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int novoFuncionario = 1;
        int totalPecas = 0;
        double valorRecebido = 0;
        String periodoComMaisProducao = "";
        int maiorProducao = 0;
        int diaComMaiorProducao = 0;

        while(true) {

            if(novoFuncionario == 2) {
                System.out.println("Dia que ocorreu a maior produção: " +diaComMaiorProducao);
                break;
            }

            System.out.println("Dia: ");
            int dia = sc.nextInt();

            if(dia > 30 || dia <= 0) {
                System.out.println("Dia inválido");
                continue;
            }

            System.out.println("Manhã: ");
            int pecasManha = sc.nextInt();
            

            System.out.println("Tarde: ");
            int pecasTarde = sc.nextInt();

            if(pecasManha > pecasTarde) {
                periodoComMaisProducao = "Manhã";
            } else {
                periodoComMaisProducao = "Tarde";
            }

            totalPecas = pecasManha + pecasTarde;

            if (totalPecas > maiorProducao) {
                maiorProducao = totalPecas;
                diaComMaiorProducao = dia;
            }

            if(dia <= 15) {
                if(totalPecas > 100 && pecasManha > 30 && pecasTarde > 30) {
                    valorRecebido = totalPecas * 0.80;
                } else {
                    valorRecebido =  totalPecas * 0.50;
                }
            } else {
                valorRecebido = (pecasManha * 0.40) + (pecasTarde * 0.30);
            }

            System.out.println("Valor recebido: " + valorRecebido);
            System.out.println("O período  que o funcionário mais produzio foi: " +periodoComMaisProducao);

            System.out.println("Novo funcionário: (1: sim 2:não): ");
            novoFuncionario = sc.nextInt();

        }
    }
}
