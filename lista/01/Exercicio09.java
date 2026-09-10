import java.util.Scanner; 
 
 
 class Exercicio09 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite um número inteiro: "); 
        int numero = sc.nextInt(); 
 
        if (numero % 2 == 0) { 
            System.out.println(numero + " é par."); 
        } else { 
            System.out.println(numero + " é ímpar."); 
        } 
 
        sc.close(); 
    } 
} 