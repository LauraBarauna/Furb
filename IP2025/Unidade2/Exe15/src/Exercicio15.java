import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        
        double valor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valor = scanner.nextDouble();

        int valorSemVirgula = (int)(valor*100);
        int reais = valorSemVirgula / 100;
        int centavos = valorSemVirgula % 100;
        double centavosD = valorSemVirgula % 100;

        // Reais

        int qtdNotaCem = reais / 100;
        reais = reais % 100;

        int qtdNotaCinquena = reais / 50;
        reais = reais % 50;

        int qtdNotaVinte = reais / 20;
        reais = reais % 20;

        int qtdNotaDez = reais / 10;
        reais = reais % 10;

        int qtdNotaCinco = reais / 5;
        reais = reais % 5;

        int qtdNotaDois = reais / 2;
        reais = reais % 2;

        int qtdMoedaUmReal = reais;

        // Centavos

        int qtdCinquentaCentavos = centavos / 50;
        centavos = centavos % 50;

        int qtdVinteCincoCentavos = centavos / 25;
        centavos = centavos % 25;

        int qtdDezCentavos = centavos / 10;
        centavos = centavos % 10;

        int qtdCincoCentavos = centavos / 5;
        centavos = centavos % 5;

        int qtdUmCentavo = centavos;


        System.out.println("Notas de R$100,00: " +qtdNotaCem);
        System.out.println("Notas de R$50,00: " +qtdNotaCinquena);
        System.out.println("Notas de R$20,00: " +qtdNotaVinte);
        System.out.println("Notas de R$10,00: " +qtdNotaDez);
        System.out.println("Notas de R$5,00: " +qtdNotaCinco);
        System.out.println("Notas de R$2,00: " +qtdNotaDois);
        System.out.println("Moedas de R$1,00: " +qtdMoedaUmReal);

        System.out.println();

        System.out.println("Moedas de R$0,50: " +qtdCinquentaCentavos);
        System.out.println("Moedas de R$0,25: " +qtdVinteCincoCentavos);
        System.out.println("Moedas de R$0,10: " +qtdDezCentavos);
        System.out.println("Moedas de R$0,05: " +qtdCincoCentavos);
        System.out.println("Moedas de R$0,01: " +qtdUmCentavo);













    }
}