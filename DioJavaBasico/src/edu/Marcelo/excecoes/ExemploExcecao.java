
package edu.Marcelo.excecoes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ExemploExcecao {
    
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
            
        } catch (ParseException e) {
           e.printStackTrace();
        }
        
      
    }
    
}
