import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pontosDireita = 0;
        int pontosEsquerda = 0;

        while (true) {
            System.out.print("Digite o ponto (D para direita, E para esquerda): ");
            String ponto = sc.nextLine().toUpperCase();

            if (ponto.equals("D")) {
                pontosDireita++;
            } else if (ponto.equals("E")) {
                pontosEsquerda++;
            } else {
                System.out.println("Entrada inválida. Digite D ou E.");
                continue;
            }

            int diferenca = Math.abs(pontosDireita - pontosEsquerda);

            if ((pontosDireita >= 21 || pontosEsquerda >= 21) && diferenca >= 2) {
                break;
            }
        }

        System.out.println("Placar final:");
        System.out.println("Jogador da Direita: " + pontosDireita);
        System.out.println("Jogador da Esquerda: " + pontosEsquerda);

        if (pontosDireita > pontosEsquerda) {
            System.out.println("Vencedor: Jogador da Direita");
        } else {
            System.out.println("Vencedor: Jogador da Esquerda");
        }

        sc.close();
    }
}
