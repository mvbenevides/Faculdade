import java.util.Scanner; 
 
 class Exercicio11 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite o primeiro número: "); 
        int a = sc.nextInt(); 
 
        System.out.print("Digite o segundo número: "); 
        int b = sc.nextInt(); 
 
        System.out.print("Digite o terceiro número: "); 
        int c = sc.nextInt(); 
 
        int maior; 
 
        if (a > b && a > c) { 
            maior = a; 
        } else if (b > a && b > c) { 
            maior = b; 
        } else { 
            maior = c; 
        } 
 
        System.out.println("O maior número é: " + maior); 
 
        sc.close(); 
    } 
} 