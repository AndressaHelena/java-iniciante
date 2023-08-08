package org.dioTv;

public class Usuario {
    public static void main (String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

            System.out.println("Tv desligada, deseja ligar? " );
            smartTv.ligar();
            System.out.println("Você ligou a TV. ");

            System.out.println("TV ligada? " + smartTv.ligada);
            System.out.println("Canal ao ligar: " + smartTv.canal);
            System.out.println("Volume ao ligar: " + smartTv.volume);
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.mudarCanal(7);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);


    }
}
