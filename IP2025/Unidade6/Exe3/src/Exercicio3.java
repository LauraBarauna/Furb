import java.text.DecimalFormat;

public class Exercicio3 {

    public Exercicio3(double[] numerosReais,DecimalFormat df) {
        System.out.println("Lendo array sem ajuste");
        ler(numerosReais);
        System.out.println("Lendo array com ajuste");
        lerValoresAjustados(numerosReais, df);
    }

    public void ler (double[] numerosReais) {
        for(int i = 0; i < numerosReais.length; i++) {
            System.out.println(numerosReais[i]);
        }
    }

    public double[] ajuste (double[] numerosReais) {

        double[] numerosReaisAjustado = new double[numerosReais.length];

        for (int i = 0; i < numerosReais.length; i++) {
            if(numerosReais[i] % 2 == 0) {
                numerosReaisAjustado[i] = numerosReais[i] * 1.02;
            } else {
                numerosReaisAjustado[i] = numerosReais[i] * 1.05;
            }
        }

        return numerosReaisAjustado;
    }

    public void lerValoresAjustados (double[] numerosReais, DecimalFormat df) {
        for(int i = 0; i < 12; i++) {
            System.out.println(df.format(ajuste(numerosReais)[i]));
        }
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double[] numeros = {3.5, 7.2, 1.8, 9.0, 4.0, 2.1, 6.6, 8.8, 0.9, 5.3, 7.7, 2.9};
        new Exercicio3(numeros, df);
    }

}



