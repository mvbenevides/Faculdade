import java.util.Scanner;
import java.util.Locale;

public class Ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Maior elemento");
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        int maior = matriz[0][0];
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > maior) maior = valor;
            }
        }
        System.out.println("Maior numero informado: " + maior);
        entrada.close();
    }
}
