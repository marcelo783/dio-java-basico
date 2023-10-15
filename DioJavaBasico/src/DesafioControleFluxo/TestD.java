package DesafioControleFluxo;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class TestD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("VAlor inicial: ");
        double valorInicial = sc.nextDouble();

        System.out.println("Taxa de juros: ");
        double taxaJuros = sc.nextDouble();

        System.out.println("periodo: ");
        int periodo = sc.nextInt();

        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++) {
            valorFinal *= (1 + taxaJuros);
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        sc.close();
    }
}
