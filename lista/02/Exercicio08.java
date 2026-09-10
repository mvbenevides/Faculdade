import java.util.Scanner; 
  
  class Exercicio08 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite a velocidade máxima da via: "); 
        double velocidadeLimite = sc.nextDouble(); 
  
        System.out.print("Digite a velocidade do veículo: "); 
        double velocidadeVeiculo = sc.nextDouble(); 
  
        if (velocidadeVeiculo <= velocidadeLimite) { 
            System.out.println("Dentro do limite. Não há multa."); 
        } else { 
            double percentualExcesso = ((velocidadeVeiculo - velocidadeLimite) / 
velocidadeLimite) * 100; 
  
            if (percentualExcesso <= 20) { 
                System.out.println("Infração média."); 
            } else if (percentualExcesso <= 50) { 
                System.out.println("Infração grave."); 
            } else { 
                System.out.println("Infração gravíssima."); 
            } 
        } 
  
        sc.close(); 
    } 
}