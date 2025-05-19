import java.util.Scanner;

public class Exercicio5 {

    public void lerRespostas(String[] respostasMulher, String[] respostasHomem) {
        for (int i = 0; i < respostasMulher.length; i++) {
            System.out.println("Respostas mulher: " + respostasMulher[i] + " - Respostas homem: " + respostasHomem[i]);
        }
    }

    public int calcularAfinidade(String[] respostasMulher, String[] respostasHomem) {
        int somaAfinidade = 0;
        for (int i = 0; i < respostasMulher.length; i++) {
            if (respostasMulher[i].equals(respostasHomem[i])) {
                somaAfinidade += 3;
            } else if (respostasMulher[i].equals("IND") &&
                    (respostasHomem[i].equals("SIM") || respostasHomem[i].equals("NAO"))) {
                somaAfinidade += 1;
            } else if (respostasHomem[i].equals("IND") &&
                    (respostasMulher[i].equals("SIM") || respostasMulher[i].equals("NAO"))) {
                somaAfinidade += 1;
            } else {
                somaAfinidade -= 2;
            }
        }
        return somaAfinidade;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] respostasMulher = new String[5];
        String[] respostasHomem = new String[5];

        for (int i = 0; i < respostasMulher.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Gosta de música sertaneja?");
                    System.out.println("Resposta mulher: ");
                    respostasMulher[i] = sc.nextLine().toUpperCase();
                    System.out.println("Resposta homem: ");
                    respostasHomem[i] = sc.nextLine().toUpperCase();
                    break;
                case 1:
                    System.out.println();
                    System.out.println("Gosta de futebol?");
                    System.out.println("Resposta mulher: ");
                    respostasMulher[i] = sc.nextLine().toUpperCase();
                    System.out.println("Resposta homem: ");
                    respostasHomem[i] = sc.nextLine().toUpperCase();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Gosta de seriados?");
                    System.out.println("Resposta mulher: ");
                    respostasMulher[i] = sc.nextLine().toUpperCase();
                    System.out.println("Resposta homem: ");
                    respostasHomem[i] = sc.nextLine().toUpperCase();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Gosta de redes sociais?");
                    System.out.println("Resposta mulher: ");
                    respostasMulher[i] = sc.nextLine().toUpperCase();
                    System.out.println("Resposta homem: ");
                    respostasHomem[i] = sc.nextLine().toUpperCase();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Gosta da Oktoberfest?");
                    System.out.println("Resposta mulher: ");
                    respostasMulher[i] = sc.nextLine().toUpperCase();
                    System.out.println("Resposta homem: ");
                    respostasHomem[i] = sc.nextLine().toUpperCase();
                    break;
            }
        }

        Exercicio5 exercicio5 = new Exercicio5();
        exercicio5.lerRespostas(respostasMulher, respostasHomem);
        int somaAfinidade = exercicio5.calcularAfinidade(respostasMulher, respostasHomem);

        if(somaAfinidade == 15) {
            System.out.println("Casem!");
        } else if (somaAfinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (somaAfinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (somaAfinidade >= -8) {
            System.out.println("Vale um encontro.");
        } else {
            System.out.println("Vocês se odeiam!");
        }



    }

}
