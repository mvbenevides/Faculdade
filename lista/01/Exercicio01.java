import java.util.Scanner; 
 
     class Exercicio01 { 
        public static void main(String[] a) { 
            Scanner sc = new Scanner(System.in); 
 
            System.out.print("Digite o nome: "); 
            String nome = sc.nextLine(); 
 
            System.out.print("Digite a idade: "); 
            int idade = sc.nextInt(); 
 
            System.out.print("Digite a altura (em metros): "); 
            double altura = sc.nextDouble(); 
 
            System.out.println(nome + " tem " + idade + " anos e " + 
altura + " metros de altura."); 
 
            sc.close(); 
        } 
    } 