import java.util.Scanner; 
 
 class Exercicio12 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
System.out.print("Digite o consumo mensal de energia em kWh: "); 
double consumo = sc.nextDouble(); 
double valorConta; 
if (consumo <= 100) { 
valorConta = consumo * 0.50; 
} else if (consumo <= 300) { 
valorConta = consumo * 0.75; 
} else { 
valorConta = consumo * 1.10; 
} 
System.out.printf("O valor da conta é: R$ %.2f%n", valorConta); 
sc.close(); 
} 
}