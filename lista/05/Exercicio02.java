import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
    static double imc(double massa, double estatura) {
        return massa / (estatura * estatura);
    }
    static String faixa(double valor) {
        if (valor >= 30) return "Obesidade";
        if (valor >= 25) return "Sobrepeso";
        if (valor >= 18.5) return "Peso normal";
        return "Abaixo do peso";
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Calculo de IMC");
        double[] massas = new double[4];
        double[] estaturas = new double[4];
        for (int i = 0; i < massas.length; i++) {
            System.out.print("Peso da pessoa " + (i + 1) + ": ");
            massas[i] = entrada.nextDouble();
            System.out.print("Altura em metros: ");
            estaturas[i] = entrada.nextDouble();
            while (massas[i] <= 0 || estaturas[i] <= 0) {
                System.out.print("Peso e altura precisam ser positivos. Informe os dois: ");
                massas[i] = entrada.nextDouble();
                estaturas[i] = entrada.nextDouble();
            }
        }
        for (int i = 0; i < massas.length; i++) {
            double resultado = imc(massas[i], estaturas[i]);
            System.out.printf(Locale.US, "Pessoa %d: %.2f - %s%n", i + 1, resultado, faixa(resultado));
        }
        entrada.close();
    }
}
