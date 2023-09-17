package edu.Marcelo.excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try{
        
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.print("Digite seu idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        
        //imprimindo os dados
        
        System.out.println("Olá, meu nome é " + nome.toUpperCase() + " ");
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm ");
        
        }
        catch (InputMismatchException e){
            System.err.println("O campo idade e altura precisam ser numéricos");
        }

    }

}
