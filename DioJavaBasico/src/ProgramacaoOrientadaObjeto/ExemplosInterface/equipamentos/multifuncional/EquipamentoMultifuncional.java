
package ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.multifuncional;

import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.copiadora.Copiadora;
import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.digitalizadora.Digitalizadora;
import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    
    public void copiar(){
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
       
    }
    public void imprimir(){
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
       
    }
}
