import java.util.Scanner;
import java.util.Locale;

public class Ex06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Simulacao de emprestimo");
        System.out.print("Valor inicial: ");
        double capital = entrada.nextDouble();
        System.out.print("Taxa mensal em porcentagem: ");
        double percentual = entrada.nextDouble();
        double[] saldos = new double[12];
        double jurosMensais = capital * percentual / 100;
        for (int i = 0; i < saldos.length; i++) {
            saldos[i] = capital + jurosMensais * (i + 1);
            System.out.printf(Locale.US, "Mes %d: R$ %.2f%n", i + 1, saldos[i]);
        }
        entrada.close();
    }
}
