package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.area.cliente.Cliente;

public class Estabelecimento {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();

        //Ações que não precisam estarem disponíveis para toda a aplicação
        //ações que estabelecimento prececisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboBalcao();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();

        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        

       

    }
}
