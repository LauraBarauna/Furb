public class JogoDaVelha_Mapa {
    
    private char[][] mapa;

    public int sortear(int inicio, int fim) {
        int range = fim - inicio + 1;
        int rand = (int)(Math.random() * range) + inicio;
        return rand;
    }

    public void limpaMapa() {
        mapa = new char[3][3];

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                mapa[l][c] = ' ';
            }
        }

    }

    public void desenha(int jogada) {
        System.out.println(" -------------" + ".." + "jogada: " + jogada);

        for (int l = 0; l < 3; l++) {
            System.out.print(" |");
            for (int c = 0; c < 3; c++) {
                System.out.print(" " + mapa[l][c] + " |");
            }
            System.out.println();

            if (l == 2) {
                System.out.println(" ----------------------------");
            } else {
                System.out.println(" -------------");
            }
        }


    }

    public boolean jogar(int L, int C, char jogador) {

        if (mapa[L][C] == 'X' || mapa[L][C] == 'O') {
            return false;
        }

        mapa[L][C] = jogador;
        return true;

    }

    public boolean ganhou(char jogador) {

        int qtdJogador;


        for (int l = 0; l < 3; l++) {
            qtdJogador = 0;
            for (int c = 0; c < 3; c++) {
                if (mapa[l][c] == jogador) {
                    qtdJogador++;
                }
            }
            if (qtdJogador == 3) {
                return true;
            }
        }

        for (int c = 0; c < 3; c++) {
            qtdJogador = 0;
            for (int l = 0; l < 3; l++) {
                if (mapa[l][c] == jogador) {
                    qtdJogador++;
                }
                if (qtdJogador == 3) {
                    return true;
                }
            }
        }

        return (mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador) || (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador);
    }

}
