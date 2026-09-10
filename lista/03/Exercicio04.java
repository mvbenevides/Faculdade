import java.util.Scanner; 
  
  class Exercicio04 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int opcao; 
  
        do { 
            System.out.println("--- MENU ---"); 
            System.out.println("1 - Dobro"); 
            System.out.println("2 - Metade"); 
            System.out.println("3 - Quadrado"); 
            System.out.println("0 - Sair"); 
            System.out.print("Escolha uma opção: "); 
            opcao = sc.nextInt(); 
  
            switch (opcao) { 
                case 1 -> { 
                    System.out.print("Digite um número: "); 
                    double numero = sc.nextDouble(); 
                    System.out.printf("O dobro é: %.2f%n", numero * 2); 
                } 
                case 2 -> { 
                    System.out.print("Digite um número: "); 
                    double numero = sc.nextDouble(); 
                    System.out.printf("A metade é: %.2f%n", numero / 2); 
                } 
                case 3 -> { 
                    System.out.print("Digite um número: "); 
                    double numero = sc.nextDouble(); 
                    System.out.printf("O quadrado é: %.2f%n", numero * 
numero); 
                } 
                case 0 -> System.out.println("Encerrando o programa."); 
                default -> System.out.println("Opção inválida."); 
            } 
        } while (opcao != 0); 
  
        sc.close(); 
    } 
} 
 