
package ProgramacaoOrientadaObjeto.autodromo;


public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setchassi("90897");
        jeep.ligar();
        
        Moto z400 = new Moto();
        z400.setchassi("9875");
    }
    
}
