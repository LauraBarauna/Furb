import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = 0;
        int minutosChegada;
        int minutosSaida;
        int tempoEstacionado;

        System.out.println("Hora da chegada: ");
        int horaChegada = scanner.nextInt();

        System.out.println("Minuto da chegada: ");
        int minutoChegada = scanner.nextInt();

        System.out.println("Hora da saída: ");
        int horaSaida = scanner.nextInt();

        System.out.println("Minuto da saída: ");
        int minutoSaida = scanner.nextInt();

        minutoChegada = horaChegada * 60 + minutoChegada;
        minutoSaida = horaSaida * 60 + minutoSaida;

        tempoEstacionado = minutoSaida - minutoChegada;

        int horaTempoEstacionado =  tempoEstacionado / 60;
        int minutoTempoEstacionado = tempoEstacionado % 60;

        if (horaTempoEstacionado == 0) {
            horaTempoEstacionado = 1;
        } else if (minutoTempoEstacionado < 29) {
            horaTempoEstacionado--;
        } else if (minutoTempoEstacionado > 29) {
            horaTempoEstacionado++;
        }

        if (horaTempoEstacionado <= 2) {
            valor = horaTempoEstacionado * 5.0;
        } else if (horaTempoEstacionado <= 4) {
            valor = 2 * 5.0 + (horaTempoEstacionado - 2) * 7.5;
        } else {
            valor = 2 * 5.0 + 2 * 7.5 + (horaTempoEstacionado - 4) * 10.0;
        }

        System.out.println(horaTempoEstacionado + ":" + minutoTempoEstacionado);
        System.out.println("Preço cobrado = R$" +valor);


    }
}
