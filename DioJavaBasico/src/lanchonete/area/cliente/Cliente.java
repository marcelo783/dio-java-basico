
package lanchonete.area.cliente;

public class Cliente {
    
    public void escolherLanche(){
        System.out.println("ESCOLHENDO O LANCHE");
    }
    
    public void fazerPedido(){
        System.out.println("FAZENDO PEDIDO");
    }
    
    public void pagarConta(){
        consulatarSaldoAplicativo();
        System.out.println("PAGANDO CONTA");
    }
    
    private  void consulatarSaldoAplicativo(){
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
    
   
}
