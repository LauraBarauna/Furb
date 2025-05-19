public class Exercicio10 {
    public static void main(String[] args) {
        int encontrados = 0;

        for (int numero = 0; numero < 10000; numero++) {
            int parte1 = numero / 100;
            int parte2 = numero % 100;
            int soma = parte1 + parte2;

            if (soma * soma == numero) {
                System.out.println(numero);
                encontrados++;
            }

            if (encontrados == 10) {
                break;
            }
        }
    }
}