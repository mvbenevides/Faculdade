import java.util.Scanner;
import java.util.Locale;

public class Ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Soma da matriz");
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        long total = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) total += valor;
        }
        System.out.println("Soma dos valores: " + total);
        entrada.close();
    }
}
