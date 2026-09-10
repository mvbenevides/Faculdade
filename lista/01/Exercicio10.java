import java.util.Scanner; 
 
 class Exercicio10 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite a média final do aluno: "); 
        double media = sc.nextDouble(); 
 
        if (media >= 7) { 
            System.out.println("Situação: Aprovado"); 
        } else if (media >= 5) { 
            System.out.println("Situação: Recuperação"); 
        } else { 
            System.out.println("Situação: Reprovado"); 
        } 
 
        sc.close(); 