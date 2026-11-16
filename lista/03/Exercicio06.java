import java.util.Scanner; 
  
  class Exercicio06 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite um número inteiro não negativo: "); 
        int numero = sc.nextInt(); 
  
        if (numero < 0) { 
            System.out.println("Entrada inválida."); 
        } else { 
            long fatorial = 1; 
  
            for (int i = 1; i <= numero; i++) { 
                fatorial *= i; 
            } 
  
            System.out.println("O fatorial de " + numero + " é: " + 
fatorial); 
        } 
  
        sc.close(); 
    } 
}