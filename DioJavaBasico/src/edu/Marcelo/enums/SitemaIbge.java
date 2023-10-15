
package edu.Marcelo.enums;

public class SitemaIbge {
    
    public static void main(String[] args) {
        
        for (EstadosBrasileiro e: EstadosBrasileiro.values()){
          //  System.out.println(e.getSigla() + " - " + e.getNome());
        }
          EstadosBrasileiro eb = EstadosBrasileiro.SAO_PAULO;
    
      System.out.println(eb.getNome());
      System.out.println(eb.getSigla());
      System.out.println(eb.getNomeMaiusculo());
      System.out.println(eb.getIbge());
    }
    
  
}
