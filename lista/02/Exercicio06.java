import java.util.Scanner; 
  
  class Exercicio06 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite o valor da compra: "); 
        double valorCompra = sc.nextDouble(); 
  
        double frete; 
  
        if (valorCompra >= 199.00) { 
            frete = 0.0; 
        } else { 
            frete = 24.90; 
        } 
  
        double total = valorCompra + frete; 
  
        System.out.printf("Frete: R$ %.2f%n", frete); 
        System.out.printf("Total a pagar: R$ %.2f%n", total); 
  
        sc.close(); 
    } 
} 