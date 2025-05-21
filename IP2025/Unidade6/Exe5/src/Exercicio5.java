import java.util.Scanner;

public class Exercicio5 {

    public Exercicio5(Scanner sc) {
        String[] respostasMulher = new String[5];
        String[] respostasHomem = new String[5];

        System.out.println("Respostas mulher: ");
        lerRespostas(respostasMulher, sc);

        System.out.println("Respostas homem: ");
        lerRespostas(respostasHomem, sc);

        int somaAfinidade = calcularAfinidade(respostasMulher, respostasHomem);

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

    public void lerRespostas(String[] respostas, Scanner sc) {
        String[] perguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
        "Gosta de redes sociais?", "Gosta da Oktoberfest?"};

        for (int i = 0; i < respostas.length; i++) {
            do {
                System.out.println(perguntas[i]);
                respostas[i] = sc.nextLine().toUpperCase();
            } while (!respostas[i].equals("SIM") &&
                    !respostas[i].equals("NAO") &&
                    !respostas[i].equals("IND"));
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

        new Exercicio5(sc);


    }

}
