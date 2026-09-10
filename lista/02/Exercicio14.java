import java.util.Scanner; 
  
  class Exercicio11 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite a frequência do aluno (%): "); 
        double frequencia = sc.nextDouble(); 
  
        System.out.print("Digite a média final do aluno: "); 
        double media = sc.nextDouble(); 
  
        if (frequencia < 75) { 
            System.out.println("Reprovado por falta."); 
        } else { 
            if (media >= 7) { 
                System.out.println("Aprovado."); 
            } else if (media >= 5) { 
                System.out.println("Recuperação."); 
            } else { 
                System.out.println("Reprovado por nota."); 
            } 
        } 
  
        sc.close(); 
    } 
} 