public class Exercicio11 {
    public static void main(String[] args) {

        int biscoito = 0;

        for (int i = 0; i <= 16; i++) {

            if (biscoito >= 3) {
                biscoito = biscoito * 3;
            } else {
                biscoito += i;
                biscoito += 1;
            }

            System.out.println("HORA: " + (i + 1) + ", BISCOITOS QUEBRADOS: " + biscoito);
        }
    }
}