import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu número de horas trabalhadas mensais: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite seu número de dependentes: ");
        int dependentes = scanner.nextInt();

        int salarioTrabalho = horasTrabalhadas * 10;
        int salarioFamilia = dependentes * 60;

        int inss = (int) ((8.5 * salarioTrabalho) / 100);
        int impostoDeRenda = (5 * salarioTrabalho) / 100;

        int salario = (salarioTrabalho - impostoDeRenda - inss) + salarioFamilia;

        System.out.println("Olá " + nome + ", seu salário é de R$" + salario + ",00");

    }
}
