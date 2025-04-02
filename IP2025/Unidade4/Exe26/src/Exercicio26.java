/* 
 *  Entradas : 
 *  opcao
 *  baseT
 *  alturaT
 *  areaT
 * 
 *  ladoQ
 *  areaQ
 * 
 *  baseR
 *  alturaR
 *  areaR
 * 
 *  racioC
 *  areaC
 *
 *  Processos: 
 *  calcula a área de diferentes formas geométricas (triângulo, quadrado, retângulo e círculo) 
 *  com base na escolha do usuário. Se opçãoo for T calcula area do triângulo, se for Q área do Quadrado e assim por diante 
 * 
 * 
 *  Saidas:
 *  areaT
 *  areaQ
 *  areaR
 *  areaC
 * 
*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");  
        
        System.out.print("Opção (T, Q, R, C): ");
        char opcao = scanner.next().toUpperCase().charAt(0);  
       
        switch (opcao) {
            case 'T':
                System.out.print("Base: ");
                double baseT = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaT = scanner.nextDouble();
                double areaT = (baseT * alturaT) / 2;
                System.out.println("Área do triângulo: " + df.format(areaT));
                break;

            case 'Q':
                System.out.print("Lado: ");
                double ladoQ = scanner.nextDouble();
                double areaQ = ladoQ * ladoQ;
                System.out.println("Área do quadrado: " + df.format(areaQ));
                break;

            case 'R':
                System.out.print("Base: ");
                double baseR = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaR = scanner.nextDouble();
                double areaR = baseR * alturaR;
                System.out.println("Área do retângulo: " + df.format(areaR));
                break;

            case 'C':
                System.out.print("Raio: ");
                double raioC = scanner.nextDouble();
                double areaC = Math.PI * raioC * raioC;
                System.out.println("Área do círculo: " + df.format(areaC));
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
