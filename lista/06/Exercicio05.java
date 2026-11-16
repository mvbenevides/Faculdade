import java.util.Scanner;
import java.util.Locale;

public class Ex05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Diagonal da matriz");
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) System.out.print(matriz[i][i] + " ");
        System.out.println();
        entrada.close();
    }
}
