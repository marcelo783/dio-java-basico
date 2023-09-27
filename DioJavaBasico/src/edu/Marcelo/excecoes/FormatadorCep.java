
package edu.Marcelo.excecoes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatCep("2389150");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException ex) {
            System.out.println("O ceo não corresponde as regras de negócios!!");
        }
        
    }
    static  String formatCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8)
            throw new CepInvalidoException();
        
        return  "23.765-064";
    }
}
