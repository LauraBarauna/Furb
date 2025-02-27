
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        
        int valor;

        int qtdNota100;
        int qtdNota50;
        int qtdNota20;
        int qtdNota10;
        int qtdNota5;
        int qtdNota2;
        int qtdNota1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valor = scanner.nextInt();

        qtdNota100 = valor / 100;
        valor = valor % 100;

        qtdNota50 = valor / 50;
        valor = valor % 50;

        qtdNota20 = valor / 20;
        valor = valor % 20;

        qtdNota10 = valor / 10;
        valor = valor % 10;

        qtdNota5 = valor / 5;
        valor = valor % 5;

        qtdNota2 = valor / 2;
        valor = valor % 2;

        qtdNota1 = valor / 1;

        System.out.println("Qtd notas de R$ 100,00: " + qtdNota100);
        System.out.println("Qtd notas de R$ 50,00: " + qtdNota50);
        System.out.println("Qtd notas de R$ 20,00: " + qtdNota20);
        System.out.println("Qtd notas de R$ 10,00: " + qtdNota10);
        System.out.println("Qtd notas de R$ 5,00: " + qtdNota5);
        System.out.println("Qtd notas de R$ 2,00: " + qtdNota2);
        System.out.println("Qtd moedas de R$ 1,00: " + qtdNota1);

    

        scanner.close();
    }
}
