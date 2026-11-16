import java.util.Scanner;
import java.util.Locale;

public class Ex07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Folha de pagamento");
        double[] pagamentos = new double[6];
        double total = 0;
        for (int i = 0; i < pagamentos.length; i++) {
            System.out.print("Salario " + (i + 1) + ": ");
            pagamentos[i] = entrada.nextDouble();
            total += pagamentos[i];
        }
        double menor = pagamentos[0], maior = pagamentos[0];
        double media = total / pagamentos.length;
        int acima = 0;
        for (double salario : pagamentos) {
            if (salario < menor) menor = salario;
            if (salario > maior) maior = salario;
            if (salario > media) acima++;
        }
        System.out.printf(Locale.US, "Menor: %.2f%nMaior: %.2f%nMedia: %.2f%n", menor, maior, media);
        System.out.println("Salarios acima da media: " + acima);
        entrada.close();
    }
}
