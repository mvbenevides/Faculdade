import java.util.Scanner;
import java.util.Locale;

public class Ex05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Promocao da loja");
        double[] valores = new double[5];
        double[] promocao = new double[5];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Preco " + (i + 1) + ": ");
            valores[i] = entrada.nextDouble();
            promocao[i] = valores[i] - valores[i] * 0.10;
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.printf(Locale.US, "Produto %d: de %.2f por %.2f%n", i + 1, valores[i], promocao[i]);
        }
        entrada.close();
    }
}
