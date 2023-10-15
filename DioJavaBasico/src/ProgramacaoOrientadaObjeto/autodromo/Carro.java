package ProgramacaoOrientadaObjeto.autodromo;

public class Carro extends Veiculo {

    public void ligar() {
        conferindoCambio();
        confereCombustivel();
        System.out.println("carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("conferindo combustivel");
    }

    private void conferindoCambio() {
        System.out.println("conferindo cambio em P");
    }

}
