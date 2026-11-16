import java.util.Scanner;
import java.util.Locale;

public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Compra no mercado");
        double[] produtos = new double[5];
        double soma = 0;
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Valor do produto " + (i + 1) + ": ");
            produtos[i] = entrada.nextDouble();
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf(Locale.US, "Produto %d: %.2f%n", i + 1, produtos[i]);
            soma += produtos[i];
        }
        System.out.printf(Locale.US, "Total: R$ %.2f%n", soma);
        entrada.close();
    }
}
