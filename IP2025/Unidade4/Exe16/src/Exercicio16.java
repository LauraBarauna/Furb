/* 
 *  Entradas : 
 *  idadeHomem1
 *  idadeHomem2
 *  idadeMulher1
 *  idadeMulher2
 *
 *  Processos: 
 *  a soma é a soma da idade do homem mais velho com a idade da mulher mais nova
 *  o produto é a idade do homem mais novo multiplicado com a idade da mulher mais velha
 * 
 * 
 *  Saidas:
 *  soma e produto
 * 
 *  Testes:
 *  idadeHomem1 = 35
 *  idadeHomem2 = 25
 *  idadeMulher1 = 30
 *  idadeMulher2 = 20
 * 
 *  homemMaisVelho = idadeHomem1
 *  homemMaisNovo = idadeHomem2
 *  
 *  mulherMaisVelha = idadeMulher1
 *  mulherMaisNova = idadeMulher2
 *  
 *  soma = homemMaisVelho + mulherMaisNova
 *  produto = homemMaisNovo * mulherMaisVelha
*/


import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int homemMaisVelho = 0;
        int homemMaisNovo = 0;
        int mulherMaisVelha = 0;
        int mulherMaisNova = 0;

        System.out.println("Informe as idades do homens: ");
        int idadeHomem1 = scanner.nextInt();
        int idadeHomem2 = scanner.nextInt();


        System.out.println("Informe as idades das mulheres: ");
        int idadeMulher1 = scanner.nextInt();
        int idadeMulher2 = scanner.nextInt();

        if (idadeHomem1 > idadeHomem2) {
            homemMaisVelho = idadeHomem1;
            homemMaisNovo = idadeHomem2;
        } else {
            homemMaisVelho = idadeHomem2;
            homemMaisNovo = idadeHomem1;
        }   

        if (idadeMulher1 > idadeMulher2) {
            mulherMaisVelha = idadeMulher1;
            mulherMaisNova = idadeMulher2;
        } else {
            mulherMaisVelha = idadeMulher2;
            mulherMaisNova = idadeMulher1;
        }

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + soma + " Produto: " + produto);

    }
}