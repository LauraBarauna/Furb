/* 
 *  Entradas : 
 *  int distancia
 *  int tempo
 *
 *  Processos: 
 *  double velocidadeMedia =  distancia / tempo
 *  double qtdCombustivel = distancia / 12
 * 
 *  Saidas:
 *  velocidadeMedia
 *  qtdCombustivel
 * 
 *  Testes:
 *  double velocidadeMedia =  240 / 4 = 60
 *  double qtdCombustivel = 240 / 12 = 20
 * 
*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int litrosPorKmAutomovel = 12;

        System.out.println("Digite a distância percorrida: ");
        int distancia = scanner.nextInt();

        System.out.println("Digite o tempo gasto: ");
        int tempo = scanner.nextInt();

        double velocidadeMedia = (double) distancia / tempo;
        double qtdCombustivel = (double) distancia / litrosPorKmAutomovel;

        System.out.println("A velocidade média foi de " + velocidadeMedia + " km/h e a quantidade de combustível usado foi " + qtdCombustivel + " litros.");
    
    }
}