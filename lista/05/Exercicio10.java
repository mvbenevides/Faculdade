import java.util.Scanner;
import java.util.Locale;

public class Ex10 {
    static int fibonacci(int posicao) {
        if (posicao < 2) return posicao;
        return fibonacci(posicao - 1) + fibonacci(posicao - 2);
    }
    static int soma(int[] valores) {
        int resultado = 0;
        for (int valor : valores) resultado += valor;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Termos de Fibonacci");
        System.out.print("Quantidade de termos (1 a 30): ");
        int quantidade = entrada.nextInt();
        if (quantidade < 1 || quantidade > 30) {
            System.out.println("Quantidade fora do intervalo.");
            entrada.close();
            return;
        }
        int[] termos = new int[quantidade];
        for (int i = 0; i < termos.length; i++) termos[i] = fibonacci(i);
        for (int termo : termos) System.out.print(termo + " ");
        System.out.println("\nSoma dos termos: " + soma(termos));
        entrada.close();
    }
}
