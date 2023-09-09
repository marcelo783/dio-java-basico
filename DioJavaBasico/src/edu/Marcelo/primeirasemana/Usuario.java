package edu.Marcelo.primeirasemana;

public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        //mudar o canal
        System.out.println("Canal Atual ? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? " + smartTv.canal);

        smartTv.subirCanal();

        System.out.println("TV ligada ? " + smartTv.ligada);

        System.out.println("Volume ? " + smartTv.volume);

        smartTv.Ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.Desligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

    }

}
