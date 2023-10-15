
package ProgramacaoOrientadaObjeto.ExemplosInterface.estabelecimento;

import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.copiadora.Copiadora;
import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.digitalizadora.Digitalizadora;
import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.impressora.Deskjet;
import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.impressora.Impressora;
import ProgramacaoOrientadaObjeto.ExemplosInterface.equipamentos.multifuncional.EquipamentoMultifuncional;


public class Fabrica {
    public static void main(String[] args) {
        
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora  digitalizadora = em;
        Copiadora copiadora = em;
        
       impressora.imprimir();
       digitalizadora.digitalizar();
       copiadora.copiar();
    }
}
