import java.util.Scanner;
import java.util.Locale;

public class Ex08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Resultado da turma");
        double[] resultados = new double[10];
        int aprovados = 0, recuperacao = 0, reprovados = 0;
        for (int i = 0; i < resultados.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            resultados[i] = entrada.nextDouble();
        }
        for (double nota : resultados) {
            if (nota < 4) reprovados++;
            else if (nota < 6) recuperacao++;
            else aprovados++;
        }
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Em recuperacao: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
        entrada.close();
    }
}
