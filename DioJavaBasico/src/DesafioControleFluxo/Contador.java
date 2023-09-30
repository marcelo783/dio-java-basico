package DesafioControleFluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro parametro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Digite o segundo parametro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosIvalidosException e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro!!");

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosIvalidosException {

        if (parametroUm > parametroDois) {
            
             throw new ParametrosIvalidosException();
       

        } 
        
         int contagem = parametroDois - parametroUm;
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println(i);
            }
            
        
    }

}
