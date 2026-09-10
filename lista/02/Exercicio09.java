import java.util.Scanner; 
  
  class Exercicio09 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite o salário do funcionário: "); 
        double salario = sc.nextDouble(); 
  
        System.out.print("Digite o tempo de casa em anos: "); 
        double tempoDeCasa = sc.nextDouble(); 
  
        double percentualBonus; 
  
        if (tempoDeCasa < 1) { 
            percentualBonus = 0.0; 
        } else if (tempoDeCasa <= 3) { 
            percentualBonus = 0.05; 
        } else if (tempoDeCasa <= 10) { 
            percentualBonus = 0.10; 
        } else { 
            percentualBonus = 0.15; 
        } 
  
        double valorBonus = salario * percentualBonus; 
  
        System.out.printf("Percentual de bônus: %.0f%%%n", percentualBonus * 100); 
        System.out.printf("Valor do bônus: R$ %.2f%n", valorBonus); 
  
        sc.close(); 
    } 
} 