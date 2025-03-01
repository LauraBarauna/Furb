import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a comprimento: ");
        int comprimento = scanner.nextInt();

        System.out.println("Digite o altura: ");
        int altura = scanner.nextInt();

        int area = comprimento * altura;
        int totalAzulejos = area * 9;
        double custoTotal = 12.50 * totalAzulejos;

        System.out.println("Você irá comprar " +totalAzulejos+ ", o valor total é de R$ " + custoTotal);


    }
}
