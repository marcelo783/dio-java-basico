
package edu.Marcelo.Condicoes;

import java.util.Locale;
import java.util.Scanner;


public class ResultadoEscolar {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua nota: ");
        float nota = sc.nextFloat();
        
    String resultado = nota >=7 ? "aprovado" : nota > 5 && nota < 7 ? "recuperacao" : "reprovado";       
        System.out.println(resultado);
    }
    
}
