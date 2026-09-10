import java.util.Scanner; 
  
  class Exercicio15 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.println("Digite o tipo de veículo (1-Carro 2-Moto): "); 
        int tipoVeiculo = sc.nextInt(); 
  
        double tarifaPorHora; 
  
        switch (tipoVeiculo) { 
            case 1 -> tarifaPorHora = 8.00; 
            case 2 -> tarifaPorHora = 5.00; 
            default -> tarifaPorHora = -1; 
        } 
  
        if (tarifaPorHora == -1) { 
            System.out.println("Opção inválida."); 
        } else { 
            System.out.print("Digite a quantidade de horas: "); 
            double horas = sc.nextDouble(); 
  
            double valor = tarifaPorHora * horas; 
  
            sc.nextLine(); 
            System.out.print("Possui cupom de desconto? (sim/nao): "); 
            String temCupom = sc.nextLine(); 
  
            if (temCupom.equalsIgnoreCase("sim")) { 
                if (valor >= 50.00) { 
                    valor = valor - (valor * 0.20); 
                    System.out.println("Cupom aplicado: 20% de desconto."); 
                } else { 
                    System.out.println("O cupom vale apenas para valores acima de R$ 
50,00."); 
                } 
            } 
  
            if (horas > 12) { 
                System.out.println("Aviso: permanência longa."); 
            } 
  
            if (horas > 24) { 
                System.out.println("Aviso: será cobrada diária."); 
            } 
  
            if (horas <= 2) { 
                System.out.println("Permanência: curta."); 
            } else if (horas <= 6) { 
                System.out.println("Permanência: média."); 
            } else { 
                System.out.println("Permanência: longa."); 
            } 
  
            System.out.printf("Valor final: R$ %.2f%n", valor); 
        } 
  
        sc.close(); 
    } 
}