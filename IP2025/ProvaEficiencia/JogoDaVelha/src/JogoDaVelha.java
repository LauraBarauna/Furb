import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {

    private JogoDaVelha_Mapa jogoMapa;
    private JogoDaVelha_PC jogoPc;
    private JogoDaVelha_Jogador jogoJogador;

    private void jogar(Scanner teclado) {

        int rodada;
        boolean jogadorGanhou = false;
        boolean pcGanhou = false;
        boolean vezDoJogador = new Random().nextBoolean();

            jogoMapa.limpaMapa();
            for (rodada = 0; rodada < 9; rodada++) {

                jogoMapa.desenha(rodada);

                if (vezDoJogador) {
                    jogadorGanhou = jogoJogador.joga(teclado);
                } else {
                    pcGanhou = jogoPc.joga();
                }

                if (jogadorGanhou || pcGanhou) {
                    break;
                }

                vezDoJogador = !vezDoJogador;

            }

            jogoMapa.desenha(rodada);

            if(jogadorGanhou) {
                System.out.println(" ...JOGADOR GANHOU!!");
            } else if (pcGanhou) {
                System.out.println(" ...PC GANHOU!!");
            } else {
                System.out.println("... EMPATOU!");
            }


    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        jogoDaVelha.jogoMapa = new JogoDaVelha_Mapa();
        jogoDaVelha.jogoPc = new JogoDaVelha_PC(jogoDaVelha.jogoMapa);
        jogoDaVelha.jogoJogador = new JogoDaVelha_Jogador(jogoDaVelha.jogoMapa);

        char continuarJogada = 's';
        while (continuarJogada == 's') {

            jogoDaVelha.jogar(teclado);

            System.out.println("Deseja jogar novamente (s/n)? ");
            continuarJogada = teclado.next().charAt(0);
        }

    }

}
