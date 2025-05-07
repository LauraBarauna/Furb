import java.text.DecimalFormat;

public class Exercicio22 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.##");
        double salario = 2000;
        int ano = 1997;

        double percentualAumento = 1.5;
        salario += salario * (percentualAumento / 100);



        while (ano < 2025) {
            percentualAumento *= 2;
            salario += salario * (percentualAumento / 100);
            ano++;
        }

        System.out.println("Sálario atual em 2025: " + df.format(salario));




    }
}
