
package ProgramacaoOrientadaObjeto.MsnMessenger.apps;


public class MsnMessenger extends ServicoMensagemInstatanea{

    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN menssenger");
       
    }

    
    public void receberMensagem() {
          System.out.println("Recebendo mensagem pelo MSN menssenger");
       
    }
  
   
}
