
/* 
 *  Entradas : 
 *  double nome;
 *  double horasTrabalhadas
 *  double dependentes
 *
 *  Processos: 
 *  double salarioTrabalho =  horasTrabalhadas * 10;
 *  double salarioFamilia = dependentes * 60;
 *  double salarioBruto = salarioTrabalho + salarioFamilia;
 *
 *  double inss = (double) ((8.5 * salarioTrabalho) / 100);
 *  double impostoDeRenda = (double) (5 * salarioTrabalho) / 100;
 *
 *  double salarioLiquido = (double) salarioBruto - impostoDeRenda - inss;
 * 
 *  Saidas:
 *  salarioBruto
 *  salarioLiquido
 * 
 *  Testes:
 *  double salarioTrabalho =  160 * 10 = 1600;
 *  double salarioFamilia = 2 * 60 = 120;
 *  double salarioBruto = 120 + 1600 = 1720;
 *
 *  double inss = (double) ((8.5 * 1600) / 100) = 136;
 *  double impostoDeRenda = (double) (5 * 1600) / 100 = 80;
 *
 *  double salarioLiquido = (double) 1720 - 136 - 80 = 1504;
 * 
*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int valorHora = 10;
        int valorDependente = 60;

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu número de horas trabalhadas mensais: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite seu número de dependentes: ");
        int dependentes = scanner.nextInt();

        double salarioTrabalho =  horasTrabalhadas * valorHora;
        double salarioFamilia = dependentes * valorDependente;
        double salarioBruto = salarioTrabalho + salarioFamilia;

        double inss = (double) ((8.5 * salarioTrabalho) / 100);
        double impostoDeRenda = (double) (5 * salarioTrabalho) / 100;

        double salarioLiquido = (double) salarioBruto - impostoDeRenda - inss;

        System.out.println("O funcionário " + nome + " possui um salário bruto de R$ " + salarioBruto + " e um salário líquido de R$ " + salarioLiquido);

    }
}