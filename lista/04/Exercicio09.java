import java.util.Scanner;
import java.util.Locale;

public class Ex09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Consulta de precos");
        int[] referencias = {110, 220, 330, 440, 550};
        double[] tabela = {6.90, 15.00, 8.50, 32.90, 4.25};
        System.out.println("Codigos: 110, 220, 330, 440, 550");
        System.out.print("Qual codigo deseja consultar? ");
        int busca = entrada.nextInt();
        boolean encontrou = false;
        for (int i = 0; i < referencias.length; i++) {
            if (referencias[i] == busca) {
                System.out.printf(Locale.US, "Valor: R$ %.2f%n", tabela[i]);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) System.out.println("Esse produto nao esta cadastrado.");
        entrada.close();
    }
}
