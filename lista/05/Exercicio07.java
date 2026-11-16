import java.util.Scanner;
import java.util.Locale;

public class Ex07 {
    static String iniciais(String nome) {
        if (nome.trim().isEmpty()) return "";
        StringBuilder abreviacao = new StringBuilder();
        for (String parte : nome.trim().split("\\s+")) {
            abreviacao.append(parte.substring(0, 1).toUpperCase(Locale.ROOT)).append('.');
        }
        return abreviacao.toString();
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nomes e iniciais");
        String[] alunos = new String[4];
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Nome completo " + (i + 1) + ": ");
            alunos[i] = entrada.nextLine().trim();
        }
        for (int i = 0; i < alunos.length; i++) {
            System.out.println((i + 1) + ") " + alunos[i] + " - " + iniciais(alunos[i]));
        }
        entrada.close();
    }
}
