import java.util.Scanner;
import java.util.Locale;

public class Ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Media das avaliacoes");
        double[] avaliacoes = new double[4];
        double total = 0;
        for (int i = 0; i < avaliacoes.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            avaliacoes[i] = entrada.nextDouble();
            total += avaliacoes[i];
        }
        double media = total / avaliacoes.length;
        System.out.printf(Locale.US, "Media final: %.2f%n", media);
        System.out.println(media >= 6 ? "Aluno aprovado." : "Aluno reprovado.");
        entrada.close();
    }
}
