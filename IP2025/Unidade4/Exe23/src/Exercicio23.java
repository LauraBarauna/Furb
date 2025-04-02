/* 
 *  Entradas : 
 *  mes
 *
 *  Processos: 
 *  Imrpime o mês por extenso, por exemplo, se mes for igual a 4, imrpime Abril e assim por diante
 *  se mes for um número maior que 12, imprime valor inválido, porque 12 é o últim mês do ano (dezembro)
 * 
 *  Saidas:
 *  Janeiro
 *  Fevereiro
 *  Março
 *  Abril
 *  Maio
 *  Junho
 *  Julho
 *  Agosto
 *  Setembro
 *  Outubro
 *  Novembro
 *  Dezembro
 *  Valor inválido
 * 
 * 
*/


import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número do mês: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Valor inválido");
        }

    }
}
