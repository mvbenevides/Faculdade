import java.util.Scanner; 
  
  class Exercicio07 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite a hora do dia (0 a 23): "); 
        int hora = sc.nextInt(); 
  
        if (hora < 0 || hora > 23) { 
            System.out.println("Hora inválida."); 
        } else if (hora <= 11) { 
            System.out.println("Bom dia!"); 
        } else if (hora <= 17) { 
            System.out.println("Boa tarde!"); 
        } else { 
            System.out.println("Boa noite!"); 
        } 
  
        sc.close(); 
    } 
}   