
package DesafioControleFluxo;

import java.util.Scanner;


public class ExemploExcecao {
    public static void main(String[] args) {
        int numeroUm = 5;
        int numeroDois = 10;

        try {
            calcularEImprimirContagem(numeroUm, numeroDois);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }

    public static void calcularEImprimirContagem(int numeroUm, int numeroDois) {
        if (numeroDois > numeroUm) {
            // Lançar uma exceção se o segundo número for maior que o primeiro
            throw new IllegalArgumentException("O segundo número deve ser maior que o primeiro.");
        } else {
            int contagem = numeroDois - numeroUm;

            for (int i = 0; i <= contagem; i++) {
                System.out.println("Iteração " + (i + 1));
            }
        }
    }
}
