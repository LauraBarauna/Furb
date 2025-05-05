
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumPar = 0;
        int sumImpar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sumPar += i;
            } else {
                sumImpar += i;
            }
        }

        System.out.println("Soma dos números pares: " +sumPar);
        System.out.println("Soma dos números ímpares: " +sumImpar);

        sc.close();
    }
}