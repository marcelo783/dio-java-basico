
package ProgramacaoOrientadaObjeto.MsnMessenger;

import ProgramacaoOrientadaObjeto.MsnMessenger.apps.ServicoMensagemInstatanea;
import ProgramacaoOrientadaObjeto.MsnMessenger.apps.Telegram;
import ProgramacaoOrientadaObjeto.MsnMessenger.apps.MsnMessenger;
import ProgramacaoOrientadaObjeto.MsnMessenger.apps.FacebookMesseger;


public class ComputadorMarcelo {
    public static void main(String[] args) {
      
        ServicoMensagemInstatanea smi = null;
        
        /*
        NÃO SE SABE QUAL APP
        MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */
        
        String appEscolhido = "fbm";
        
        if(appEscolhido.equals("msn"))
            smi = new MsnMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMesseger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();
        
        smi.validarConectadoInternet();
        
       
     
}
}
