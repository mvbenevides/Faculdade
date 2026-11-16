import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    static boolean primo(int valor) {
        if (valor < 2) return false;
        for (int divisor = 2; divisor <= valor / divisor; divisor++) {
            if (valor % divisor == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Busca por numeros primos");
        int[] valores = new int[8];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();
        }
        int quantidade = 0;
        System.out.print("Primos encontrados: ");
        for (int valor : valores) {
            if (primo(valor)) {
                System.out.print(valor + " ");
                quantidade++;
            }
        }
        System.out.println("\nQuantidade: " + quantidade);
        entrada.close();
    }
}
