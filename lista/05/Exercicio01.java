import java.util.Scanner;
import java.util.Locale;

public class Ex01 {
    static String linha(int quantidade) {
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < quantidade; i++) texto.append('*');
        return texto.toString();
    }
    static void triangulo(int altura) {
        for (int nivel = 1; nivel <= altura; nivel++) System.out.println(linha(nivel));
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Desenho de triangulos");
        int[] tamanhos = new int[3];
        for (int i = 0; i < tamanhos.length; i++) {
            System.out.print("Altura do triangulo " + (i + 1) + ": ");
            tamanhos[i] = entrada.nextInt();
            while (tamanhos[i] < 1) {
                System.out.print("Use uma altura positiva: ");
                tamanhos[i] = entrada.nextInt();
            }
        }
        for (int altura : tamanhos) {
            triangulo(altura);
            System.out.println();
        }
        entrada.close();
    }
}
