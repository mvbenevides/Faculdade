import java.util.Scanner;
import java.util.Locale;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Notas da atividade");
        double[] notas = {8.0, 6.5, 9.0, 7.0};
        System.out.println("Notas registradas: " + notas.length);
        System.out.println("Primeira: " + notas[0]);
        System.out.println("Ultima: " + notas[notas.length - 1]);
        entrada.close();
    }
}
