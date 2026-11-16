import java.util.Scanner; 
  
  class Exercicio07 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite a quantidade de alunos: "); 
        int quantidadeAlunos = sc.nextInt(); 
  
        double somaNotas = 0; 
        int aprovados = 0; 
        int abaixoDaMedia = 0; 
  
        for (int i = 1; i <= quantidadeAlunos; i++) { 
            System.out.print("Digite a nota do aluno " + i + ": "); 
            double nota = sc.nextDouble(); 
  
            somaNotas += nota; 
  
            if (nota >= 6) { 
                aprovados++; 
            } else { 
                abaixoDaMedia++; 
            } 
        } 
  
        double mediaTurma = somaNotas / quantidadeAlunos; 
  
        System.out.printf("Média da turma: %.2f%n", mediaTurma); 
        System.out.println("Alunos com nota >= 6: " + aprovados); 
        System.out.println("Alunos com nota < 6: " + abaixoDaMedia); 
  
        sc.close(); 
    } 
} 