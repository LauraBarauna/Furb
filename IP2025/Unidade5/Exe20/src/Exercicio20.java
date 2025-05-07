import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a massa inicial em KG: ");
        double kg = sc.nextDouble();

        int segundos = 0;

        System.out.println("Massa inicial: " + kg + " kg");


        while(kg >= 0.5) {
            kg = kg / 2;
            segundos += 50;
        }

        System.out.println("Massa final: " + kg + " kg");
        System.out.println("Tempo em segundos que chegou na massa final: " + segundos);



    }
}
