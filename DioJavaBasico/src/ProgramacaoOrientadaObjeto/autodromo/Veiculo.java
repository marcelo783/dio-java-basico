/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacaoOrientadaObjeto.autodromo;

/**
 *
 * @author MARCELO
 */
public abstract class Veiculo {
    private String chassi;
    public  String getchassi(){
        return chassi;
    }
    public void setchassi(String chassi){
        this.chassi = this.chassi;
    }
    public abstract void ligar();
    
}
