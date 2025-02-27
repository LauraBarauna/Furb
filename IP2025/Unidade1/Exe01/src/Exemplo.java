
import java.util.Scanner;

public class Exemplo {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite a nota 2: ");
        float n2 = scanner.nextFloat();

        System.out.println("Digite a nota 3: ");
        float n3 = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        float media = Math.round((n1 + n2 + n3) / 3);

        System.out.println("O aluno(a) " + nome + " tem uma média de: "  + media);


    }

}

