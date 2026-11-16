import java.util.Scanner; 
 
 class Exercicio08 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Digite a temperatura em graus Celsius: "); 
        double celsius = sc.nextDouble(); 
 
        double fahrenheit = celsius * 9.0 / 5.0 + 32; 
        double kelvin = celsius + 273.15; 
 
        System.out.printf("%.2f °C equivale a %.2f °F%n", celsius, 
fahrenheit); 
        System.out.printf("%.2f °C equivale a %.2f K%n", celsius, 
kelvin); 
 
        sc.close(); 
    } 
} 