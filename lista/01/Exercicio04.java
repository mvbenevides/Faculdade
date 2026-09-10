 
import java.util.Scanner; 
 
class Exercicio04 {  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite a nota do 1º bimestre: "); 
        double nota1 = sc.nextDouble(); 
 
        System.out.print("Digite a nota do 2º bimestre: "); 
        double nota2 = sc.nextDouble(); 
 
        System.out.print("Digite a nota do 3º bimestre: "); 
        double nota3 = sc.nextDouble(); 
 
        System.out.print("Digite a nota do 4º bimestre: "); 
        double nota4 = sc.nextDouble(); 
 
        double media = (nota1 + nota2 + nota3 + nota4) / 4; 
 
        System.out.printf("A média aritmética do aluno é: %.2f%n", 
media); 
 
        sc.close(); 
    } 
} 