
import java.util.Scanner;

class Exercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = sc.nextInt();

        int cedula = 20;

        while (valor > 0) {
            int qtd = 0;

            while (valor >= cedula) {
                valor -= cedula;
                qtd++;
            }

            if (qtd > 0) {
                System.out.println(qtd + " cédula(s) de " + cedula);
            }

            
            switch (cedula) {
                case 20:
                    cedula = 10;
                    break;
                case 10:
                    cedula = 5;
                    break;
                case 5:
                    cedula = 2;
                    break;
                case 2:
                    cedula = 1;
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}
