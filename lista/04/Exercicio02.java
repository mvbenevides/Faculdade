import java.util.Scanner;
import java.util.Locale;

public class Ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Precos da papelaria");
        double[] valores = {4.75, 18.50, 9.90};
        for (int item = 0; item < valores.length; item++) {
            System.out.printf(Locale.US, "Produto %d: R$ %.2f%n", item + 1, valores[item]);
        }
        entrada.close();
    }
}
