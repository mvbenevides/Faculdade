import java.util.Scanner; 
  
  class Exercicio04 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite o primeiro número: "); 
        int a = sc.nextInt(); 
  
        System.out.print("Digite o segundo número: "); 
        int b = sc.nextInt(); 
  
        if (b == 0) { 
            System.out.println("A verificação não pode ser feita."); 
        } else if (a % b == 0) { 
            System.out.println(a + " é múltiplo de " + b + "."); 
        } else { 
            System.out.println(a + " não é múltiplo de " + b + "."); 
        } 
  
        sc.close(); 
    } 
}