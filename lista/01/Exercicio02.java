import java.util.Scanner; 
 
 class Exercicio02 { 
    public static void main(String[] c) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite o primeiro número inteiro: "); 
        int a = sc.nextInt(); 
 
        System.out.print("Digite o segundo número inteiro: "); 
        int b = sc.nextInt(); 
 
        int soma = a + b; 
        int subtracao = a - b; 
        int produto = a * b; 
        int divisaoInteira = a / b; 
        int resto = a % b; 
 
        System.out.println("Soma: " + soma); 
        System.out.println("Subtração: " + subtracao); 
        System.out.println("Produto: " + produto); 
        System.out.println("Divisão inteira: " + divisaoInteira); 
        System.out.println("Resto da divisão: " + resto); 
 
        sc.close(); 
    } 
} 