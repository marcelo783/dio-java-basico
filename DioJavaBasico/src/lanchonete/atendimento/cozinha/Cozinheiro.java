package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;

public class Cozinheiro {

    //pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALÇÃO");
    }

    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    //
    public void adicionarComboBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredienteLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredienteVitamina() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA HHAMBURGER");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

   private  void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}
