/* 
 *  Entradas : 
 *  dia
 *  mes
 *  ano
 *
 *  Processos: 
    Verifica se os valores digitados são válidos:
 *      - O dia deve estar entre 1 e 31 (inclusive).
 *      - O mês deve estar entre 1 e 12 (inclusive).
 *      - O ano deve ser maior que zero.
 *  Se os valores fornecidos forem válidos, o programa verifica a validade da data de acordo 
 *  com as regras do calendário:
 *      - Para os meses de janeiro e março (meses com 31 dias), a data será considerada válida.
 *      - Para os meses que não são fevereiro (meses com 30 dias), a data será válida apenas se o dia for menor ou igual a 30.
 *      - Para o mês de fevereiro, o dia será válido se for menor ou igual a 28, ou se for 29 e o ano for bissexto (ano divisível por 4, mas não por 100, a menos que seja divisível por 400).
 *  Se as condições de validade forem atendidas, o programa imprime "Válida". Caso contrário, imprime "Não válida".
 *  Se os valores de entrada forem inválidos (ex: dia fora de intervalo ou mês inválido), o programa também imprime "Não válida".
 * 
 *  Saidas:
 *  Válida ou Não válida
 * 
 *  Testes:
 *  dia = 15
 *  mes = 5
 *  ano = 2023
 *  VÁLIDA
 *  
 *  dia = 31
 *  mes = 4
 *  ano = 2023
 *  NÃO VÁLIDA
*/


import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3) {
                System.out.println("Válida");
            } else if (mes != 2 && dia < 31) {
                System.out.println("Válida");
            } else if (mes == 2 && dia < 29) {
                System.out.println("Válida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("Válida");
            } else {
                System.out.println("Não válida");
            }
        } else {
            System.out.println("Não válida");
        }

    }
}