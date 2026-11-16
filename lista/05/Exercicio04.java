import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
    static void ordenar(int[] valores) {
        for (int fim = valores.length - 1; fim > 0; fim--) {
            boolean trocou = false;
            for (int i = 0; i < fim; i++) {
                if (valores[i] > valores[i + 1]) {
                    int anterior = valores[i];
                    valores[i] = valores[i + 1];
                    valores[i + 1] = anterior;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
    static boolean emOrdem(int[] valores) {
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < valores[i - 1]) return false;
        }
        return true;
    }
    static void mostrar(int[] valores) {
        for (int valor : valores) System.out.print(valor + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Ordenacao de valores");
        int[] valores = new int[6];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();
        }
        mostrar(valores);
        System.out.println("Esta em ordem? " + emOrdem(valores));
        ordenar(valores);
        mostrar(valores);
        System.out.println("Esta em ordem? " + emOrdem(valores));
        entrada.close();
    }
}
