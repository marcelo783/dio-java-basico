
package ProgramacaoOrientadaObjeto.MsnMessenger.apps;


public abstract class ServicoMensagemInstatanea {
    public abstract void  enviarMensagem();
     public abstract void  receberMensagem();
     
     //somente os filhos conhecem este método
     public void validarConectadoInternet(){
         System.out.println("VALIDANDO SE ESTPA CONECTADO A INTERNET");
     }
     
}
