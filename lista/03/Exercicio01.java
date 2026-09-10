import java.util.Scanner; 
  
  class Exercicio01 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite um número inteiro N: "); 
        int n = sc.nextInt(); 
  
        if (n < 1) { 
            System.out.println("Não há valores a exibir."); 
        } else { 
            int i = 1; 
            while (i <= n) { 
                System.out.println(i); 
                i++; 
            } 
        } 
  
        sc.close(); 
    } 
}