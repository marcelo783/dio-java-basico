
package edu.Marcelo.primeirasemana;


public class SmartTv {
    
    Boolean ligada = false;
    int canal= 1;
    int volume = 25;
    
    
    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentado o volume para: " + volume);
    }
    
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
   
    public void subirCanal(){
        canal++; 
    }
    
    public void descerCanal(){
        canal --;
        
    }
    
    public void Ligar (){
        ligada = true;
    }
    
    public  void  Desligar (){
       ligada = false;
    }
    
}
