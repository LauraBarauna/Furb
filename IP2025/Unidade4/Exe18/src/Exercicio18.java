/* 
 *  Entradas : 
 *  diaVencimento
 *  diaPagamento
 *  valorPrestacao
 *
 *  Processos: 
 *  se o valor for pago até o dia do vencimento, ganha 10% de desconto
 *  ou se o valor for pago em até 5 dias dias depois do dia do vencimento, ganha 2% de aumento em cada dia de atraso
 * 
 * 
 *  Saidas:
 *  valorPrestacaoFinal com desconto de 10% ou com aumento de 2%
 * 
 *  Testes:
 *  diaVencimento = 10
 *  diaPagamento = 9
 *  valorPrestacao = 100
 *  valorPrestacaoFinal = 90
 * 
*/


import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double valorPrestacaoFinal;

        System.out.println("Dia do vencimento: ");
        int diaVencimento = scanner.nextInt();

        System.out.println("Dia do pagamento: ");
        int diaPagamento = scanner.nextInt();

        System.out.println("Valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        if ( diaPagamento <= diaVencimento) {
            valorPrestacaoFinal = (double) valorPrestacao - ((10 * valorPrestacao) / 100) ;
            System.out.println("O pagamento está em dia. O valor da prestação = R$ " + valorPrestacaoFinal);
        } else if (diaPagamento >= diaVencimento + 5) {
            int diasDeAtraso = diaPagamento - diaVencimento;
            valorPrestacaoFinal = ((2 * valorPrestacao) / 100) * diasDeAtraso + valorPrestacao;
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$ " +valorPrestacaoFinal);
        } 

        scanner.close();

    }
}