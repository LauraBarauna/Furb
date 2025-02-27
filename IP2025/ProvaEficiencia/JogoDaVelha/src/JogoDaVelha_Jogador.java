import java.util.Scanner;

public class JogoDaVelha_Jogador {
    private JogoDaVelha_Mapa mapa;
    private char letra;

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
        this.letra = 'X';
    }

    public boolean joga(Scanner teclado) {
        int linha, coluna;
        boolean jogadaValida = false;

        while (!jogadaValida) {
            System.out.println("Jogador ..");
            System.out.println(" linha: ");
            linha = teclado.nextInt();

            System.out.println(" coluna: ");
            coluna = teclado.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Campo inválido! Digite valores entre 0 e 2.");
                continue;
            }

            jogadaValida = mapa.jogar(linha, coluna, letra);

            if (!jogadaValida) {
                System.out.println("Campo já preenchido! Digite outro...");
            }

        }

        return mapa.ganhou(letra);

    }

}
