import java.util.Scanner; 
  
  class Exercicio10 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.print("Digite o usuário: "); 
        String usuario = sc.nextLine(); 
  
        System.out.print("Digite a senha: "); 
        String senha = sc.nextLine(); 
  
        if (!usuario.equals("admin")) { 
            System.out.println("Usuário não encontrado."); 
        } else { 
            if (senha.equals("java123")) { 
                System.out.println("Acesso liberado."); 
            } else { 
                System.out.println("Senha incorreta."); 
            } 
        } 
  
        sc.close(); 
    } 
}