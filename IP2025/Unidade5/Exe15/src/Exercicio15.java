import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String nomeAluno = " ";


        while (true) {

            System.out.println("Digite o nome do aluno: ");
            nomeAluno = sc.nextLine().toLowerCase();

            if(nomeAluno.equals("fim")){
                break;
            }

            System.out.println("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.println("Nota 2: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("A média do(a) " + nomeAluno + "é " + df.format(media));
            sc.nextLine();

        }
    }
}
