import java.util.Scanner; 
 
 class Exercicio06 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite o raio do círculo: "); 
        double raio = sc.nextDouble(); 
 
        double area = Math.PI * raio * raio; 
        double perimetro = 2 * Math.PI * raio; 
 
        System.out.printf("Área: %.2f%n", area); 
        System.out.printf("Perímetro: %.2f%n", perimetro); 
 
        sc.close(); 
    } 
} 