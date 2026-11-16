import java.util.Scanner;
import java.util.Locale;

public class Ex08 {
    static String maior(String[] palavras) {
        int posicao = 0;
        for (int i = 1; i < palavras.length; i++) {
            if (palavras[i].length() > palavras[posicao].length()) posicao = i;
        }
        return palavras[posicao];
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Separando uma frase");
        System.out.print("Escreva uma frase: ");
        String texto = entrada.nextLine().trim();
        if (texto.isEmpty()) {
            System.out.println("Nenhuma palavra foi informada.");
            entrada.close();
            return;
        }
        String[] palavras = texto.split("\\s+");
        for (int i = 0; i < palavras.length; i++) System.out.println((i + 1) + ": " + palavras[i]);
        System.out.println("Quantidade: " + palavras.length);
        System.out.println("Maior palavra: " + maior(palavras));
        entrada.close();
    }
}
