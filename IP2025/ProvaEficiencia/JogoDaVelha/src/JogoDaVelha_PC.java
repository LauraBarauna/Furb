public class JogoDaVelha_PC {
    private JogoDaVelha_Mapa mapa;
    private char letra;

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
        this.letra = 'O';
    }

    public boolean joga() {

        boolean jogadaValida = false;

        while (!jogadaValida) {
            int linha = mapa.sortear(0, 2);
            int coluna = mapa.sortear(0, 2);

            System.out.println("PC" + "[" + linha + "," + coluna + "]");
            jogadaValida = mapa.jogar(linha, coluna, letra);

        }

        return mapa.ganhou(letra);

    }

}
