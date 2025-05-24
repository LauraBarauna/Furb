import java.util.Scanner;

public class Exercicio9 {

    public Exercicio9(Scanner sc) {
        final int TOTAL_CLIENTES = 30;

        int[] sexo = new int[TOTAL_CLIENTES];      // 1=feminino, 2=masculino
        int[] nota = new int[TOTAL_CLIENTES];      // nota de 0 a 10
        int[] idade = new int[TOTAL_CLIENTES];     // idade da pessoa

        lerDados(sc, sexo, nota, idade);
        double mediaGeral = calcularMediaGeral(nota);
        double mediaHomens = calcularMediaHomens(sexo, nota);
        int notaMulherMaisJovem = obterNotaMulherMaisJovem(sexo, idade, nota);
        int mulheresMais50NotaMaior = contarMulheresMais50ComNotaMaior(mediaGeral, sexo, idade, nota);

        System.out.printf("\nMédia geral das notas: %.2f\n", mediaGeral);
        System.out.printf("Média das notas dos homens: %.2f\n", mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres com mais de 50 anos que deram nota superior à média: " + mulheresMais50NotaMaior);
    }

    public void lerDados(Scanner sc, int[] sexo, int[] nota, int[] idade) {
        for (int i = 0; i < sexo.length; i++) {
            System.out.println("\nCliente " + (i + 1) + ":");

            do {
                System.out.print("Sexo (1 = feminino, 2 = masculino): ");
                sexo[i] = sc.nextInt();
            } while (sexo[i] != 1 && sexo[i] != 2);

            do {
                System.out.print("Nota (0 a 10): ");
                nota[i] = sc.nextInt();
            } while (nota[i] < 0 || nota[i] > 10);

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
    }

    public double calcularMediaGeral(int[] nota) {
        int soma = 0;
        for (int n : nota) {
            soma += n;
        }
        return (double) soma / nota.length;
    }

    public double calcularMediaHomens(int[] sexo, int[] nota) {
        int soma = 0, qtd = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                qtd++;
            }
        }
        return (qtd == 0) ? 0 : (double) soma / qtd;
    }

    public int obterNotaMulherMaisJovem(int[] sexo, int[] idade, int[] nota) {
        int menorIdade = Integer.MAX_VALUE;
        int notaDaMaisJovem = -1;

        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idade[i] < menorIdade) {
                menorIdade = idade[i];
                notaDaMaisJovem = nota[i];
            }
        }
        return notaDaMaisJovem;
    }

    public int contarMulheresMais50ComNotaMaior(double mediaGeral, int[] sexo, int[] idade, int[] nota) {
        int cont = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Exercicio9(sc);
    }
}
