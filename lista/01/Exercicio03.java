import java.util.Scanner; 
 
 class Exercicio03 { 
    public static void main(String[] a) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite o valor em reais: "); 
        double valorEmReais = sc.nextDouble(); 
 
        System.out.print("Digite a cotação do dólar: "); 
        double cotacaoDolar = sc.nextDouble(); 
 
        double valorEmDolar = valorEmReais / cotacaoDolar; 
 
        System.out.printf("O valor convertido é: $ %.2f%n", 
valorEmDolar); 
 
        sc.close(); 
    } 
} 