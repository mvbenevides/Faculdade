import java.util.Scanner;
import java.util.Locale;

public class Ex09 {
    static long elevar(long base, int expoente) {
        if (expoente == 0) return 1;
        long metade = elevar(base, expoente / 2);
        long resultado = Math.multiplyExact(metade, metade);
        return expoente % 2 == 0 ? resultado : Math.multiplyExact(resultado, base);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Potencias com recursao");
        System.out.print("Expoente nao negativo: ");
        int expoente = entrada.nextInt();
        while (expoente < 0) {
            System.out.print("Informe zero ou um positivo: ");
            expoente = entrada.nextInt();
        }
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Base " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int base : numeros) {
            try {
                System.out.println(base + " elevado a " + expoente + " = " + elevar(base, expoente));
            } catch (ArithmeticException erro) {
                System.out.println("O resultado para a base " + base + " ultrapassa o tipo long.");
            }
        }
        entrada.close();
    }
}
