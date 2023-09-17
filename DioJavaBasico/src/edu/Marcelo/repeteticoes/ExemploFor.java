package edu.Marcelo.repeteticoes;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFor {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("quantas pessoas vai para festa?: ");
        int pessoas = sc.nextInt();
        
        //sc.nextLine();
        
        for (int c =  1; c  <= pessoas; c++){
            System.out.print("digite o nome da " + c + "°" + "pessoa: " );
            String nome = sc.nextLine();
        }

    }

}

// for (int carneiro = 1; caneiro <=20; carneiro ++){
            //System.out.println("contando carneiro " + carneiro);
