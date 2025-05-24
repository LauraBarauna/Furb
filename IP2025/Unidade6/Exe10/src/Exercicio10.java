import java.util.Scanner;

public class Exercicio10 {

    public Exercicio10() {
        final int TAMANHO_MAXIMO = 50;
        int[] vetor = new int[TAMANHO_MAXIMO];
        int tamanhoAtual = 0;

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> tamanhoAtual = incluirValor(vetor, tamanhoAtual, sc);
                case 2 -> pesquisarValor(vetor, tamanhoAtual, sc);
                case 3 -> alterarValor(vetor, tamanhoAtual, sc);
                case 4 -> tamanhoAtual = excluirValor(vetor, tamanhoAtual, sc);
                case 5 -> mostrarValores(vetor, tamanhoAtual);
                case 6 -> ordenarValores(vetor, tamanhoAtual);
                case 7 -> inverterValores(vetor, tamanhoAtual);
                case 8 -> System.out.println("Sistema finalizado.");
                default -> System.out.println("Opção inválida.");
            }

            System.out.println();

        } while (opcao != 8);
    }

    private void exibirMenu() {
        System.out.println("MENU:");
        System.out.println("1 – Incluir valor");
        System.out.println("2 – Pesquisar valor");
        System.out.println("3 – Alterar valor");
        System.out.println("4 – Excluir valor");
        System.out.println("5 – Mostrar valores");
        System.out.println("6 – Ordenar valores");
        System.out.println("7 – Inverter valores");
        System.out.println("8 – Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }

    private int incluirValor(int[] vetor, int tamanhoAtual, Scanner sc) {
        if (tamanhoAtual < vetor.length) {
            System.out.print("Digite o valor a incluir: ");
            int valor = sc.nextInt();
            vetor[tamanhoAtual] = valor;
            System.out.println("Valor incluído com sucesso.");
            return tamanhoAtual + 1;
        } else {
            System.out.println("Vetor cheio! Não é possível incluir mais valores.");
            return tamanhoAtual;
        }
    }

    private void pesquisarValor(int[] vetor, int tamanhoAtual, Scanner sc) {
        System.out.print("Digite o valor a pesquisar: ");
        int valor = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                encontrado = true;
                break;
            }
        }

        System.out.println(encontrado ? "Valor encontrado." : "Valor não encontrado.");
    }

    private void alterarValor(int[] vetor, int tamanhoAtual, Scanner sc) {
        System.out.print("Digite o valor que deseja alterar: ");
        int antigo = sc.nextInt();
        boolean alterado = false;

        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == antigo) {
                System.out.print("Digite o novo valor: ");
                vetor[i] = sc.nextInt();
                alterado = true;
                System.out.println("Valor alterado com sucesso.");
                break;
            }
        }

        if (!alterado) {
            System.out.println("Valor não encontrado.");
        }
    }

    private int excluirValor(int[] vetor, int tamanhoAtual, Scanner sc) {
        System.out.print("Digite o valor a excluir: ");
        int valor = sc.nextInt();
        int pos = -1;

        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < tamanhoAtual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            System.out.println("Valor excluído com sucesso.");
            return tamanhoAtual - 1;
        } else {
            System.out.println("Valor não encontrado.");
            return tamanhoAtual;
        }
    }

    private void mostrarValores(int[] vetor, int tamanhoAtual) {
        if (tamanhoAtual == 0) {
            System.out.println("Vetor vazio.");
        } else {
            System.out.print("Valores: ");
            for (int i = 0; i < tamanhoAtual; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }

    private void ordenarValores(int[] vetor, int tamanhoAtual) {
        for (int i = 0; i < tamanhoAtual - 1; i++) {
            for (int j = 0; j < tamanhoAtual - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados com sucesso.");
    }

    private void inverterValores(int[] vetor, int tamanhoAtual) {
        for (int i = 0; i < tamanhoAtual / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanhoAtual - 1 - i];
            vetor[tamanhoAtual - 1 - i] = temp;
        }
        System.out.println("Valores invertidos com sucesso.");
    }

    public static void main(String[] args) {
        new Exercicio10(); // Tudo acontece dentro do construtor
    }
}
