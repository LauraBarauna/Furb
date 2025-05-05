import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de repetições: ");
        int qtdRepeticao = sc.nextInt();
        sc.nextLine();

        int qtdAlunosMais20 = 0;
        String nomesMaioresDe18 = "";

        for (int i = 0 ; i < qtdRepeticao; i++) {
            System.out.println("Digite o nome " + (i+1) + ": ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade da pessoa " + nome + ": ");
            int idade = sc.nextInt();

            if (idade == 18) {
                nomesMaioresDe18 += nome + " e ";
            } else if (idade > 20) {
                qtdAlunosMais20++;
            }
            sc.nextLine();
        }

        System.out.println("Nomes dos alunos com mais de 18 anos: " + nomesMaioresDe18);
        System.out.println("Quantidade de alunos com mais de 20 anos: " + qtdAlunosMais20);

        sc.close();
    }
}