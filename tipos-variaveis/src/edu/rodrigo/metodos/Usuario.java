package edu.rodrigo.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada: "+smartTv.ligada);
        System.out.println("Tv cana: "+smartTv.canal);
        System.out.println("Tv canal: "+smartTv.volume);

        smartTv.Desligar();
        System.out.println("Tv ligada: "+smartTv.ligada);

        System.out.println("Tv volume: "+smartTv.volume);
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        System.out.println("Tv volume: "+smartTv.volume);

        
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        
        System.out.println("Tv volume: "+smartTv.volume);

    }
    
}
