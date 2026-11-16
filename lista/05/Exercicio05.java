import java.util.Scanner;
import java.util.Locale;

public class Ex05 {
    static String binario(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder restos = new StringBuilder();
        while (decimal != 0) {
            restos.append(decimal % 2);
            decimal /= 2;
        }
        return restos.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Conversao para binario");
        int[] decimais = new int[5];
        for (int i = 0; i < decimais.length; i++) {
            System.out.print("Inteiro nao negativo: ");
            decimais[i] = entrada.nextInt();
            while (decimais[i] < 0) {
                System.out.print("Tente novamente com zero ou um positivo: ");
                decimais[i] = entrada.nextInt();
            }
        }
        for (int valor : decimais) System.out.println(valor + " -> " + binario(valor));
        entrada.close();
    }
}
