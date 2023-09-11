
package ContaBanco;

import java.util.Scanner;


public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("------------------");
        System.out.println("  CONTA BANCÁRIA  ");
        System.out.println("------------------");
        
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        
        
        System.out.print("Digite o número da agencia: ");
        String agencia = scanner.next();
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("------------------");
        System.out.println("DADOS DA CONTA");
        System.out.println("------------------");
        
        
        float saldo = 570.98f;
        
        System.out.println("Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        
        System.out.println("------------------");
        
        
        
        
        
    }
}
