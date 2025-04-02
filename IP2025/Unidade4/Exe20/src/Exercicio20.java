/* 
 *  Entradas : 
 *  nota1
 *  nota2
 *  nota3
 *  notaExercicios
 *
 *  Processos: 
 *  media = (nota1 + nota2 * 2 + nota3 * 3 + notaExercicios) / 7
 *  se media for maior ou igual a 9,0 conceito = A status = Aprovado
 *  se media for maior ou igual a 7,5 e menor que 9,0 conceito = B status = Aprovado
 *  se media for maior ou igual a 6,0 e menor que 7,5 conceito = C status = Aprovado
 *  se media for maior ou igual a 4,0 e menor que 6,0 conceito = D status = Reprovado
 *  se media for menor que 4,0 conceito = E status = Reprovado
 * 
 * 
 *  Saidas:
 *  media
 *  conceito
 *  status
 * 
 * 
*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        char conceito = ' ';
        String status = "";

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota dos exercícios: ");
        double notaExercicios = scanner.nextDouble();

        double media = (nota1 + nota2 * 2 + nota3 * 3 + notaExercicios) / 7;

        if (media >= 9.0) {
            conceito = 'A';
            status = "Aprovado";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = 'B';
            status = "Aprovado";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
            status = "Aprovado";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
            status = "Reprovado";
        } else {
            conceito = 'E';
            status = "Reprovado";
        }

        System.out.println("A média de aproveitamento foi: " +df.format(media)+ ". Conceito: " +conceito+ ". " +status );
    }
    
}
