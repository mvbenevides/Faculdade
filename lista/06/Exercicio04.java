import java.util.Scanner;
import java.util.Locale;

public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Numeros pares");
        int[][] matriz = new int[2][3];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        int quantidade = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor % 2 == 0) quantidade++;
            }
        }
        System.out.println("Total de pares: " + quantidade);
        entrada.close();
    }
}
