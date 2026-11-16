import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    static int vogais(String frase) {
        String letras = "aeiouáàâãéêíóôõúü";
        int total = 0;
        for (char letra : frase.toLowerCase(Locale.ROOT).toCharArray()) {
            if (letras.indexOf(letra) >= 0) total++;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Vogais nas frases");
        String[] textos = new String[3];
        int maiorQuantidade = -1, indice = 0;
        for (int i = 0; i < textos.length; i++) {
            System.out.print("Frase " + (i + 1) + ": ");
            textos[i] = entrada.nextLine();
        }
        for (int i = 0; i < textos.length; i++) {
            int total = vogais(textos[i]);
            System.out.println("Frase " + (i + 1) + ": " + total + " vogais");
            if (total > maiorQuantidade) {
                maiorQuantidade = total;
                indice = i;
            }
        }
        System.out.println("Frase com mais vogais: " + textos[indice]);
        entrada.close();
    }
}
