import java.util.Scanner;
import java.util.Locale;

public class Ex10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Fechamento da compra");
        System.out.print("Quantos itens diferentes? ");
        int itens = entrada.nextInt();
        if (itens <= 0) {
            System.out.println("Informe pelo menos um item.");
            entrada.close();
            return;
        }
        double[] valores = new double[itens];
        int[] unidades = new int[itens];
        for (int i = 0; i < itens; i++) {
            System.out.print("Preco do item " + (i + 1) + ": ");
            valores[i] = entrada.nextDouble();
            System.out.print("Unidades: ");
            unidades[i] = entrada.nextInt();
        }
        double total = 0;
        for (int i = 0; i < itens; i++) {
            double parcial = valores[i] * unidades[i];
            System.out.printf(Locale.US, "Item %d: R$ %.2f%n", i + 1, parcial);
            total += parcial;
        }
        double desconto = total > 200 ? total * 0.05 : 0;
        System.out.printf(Locale.US, "Total: %.2f%nDesconto: %.2f%nA pagar: %.2f%n", total, desconto, total - desconto);
        entrada.close();
    }
}
