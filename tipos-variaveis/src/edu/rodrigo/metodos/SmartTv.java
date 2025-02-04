package edu.rodrigo.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 4;
    int volume = 2;

    public void Ligar(){
        ligada = true;
    }

    public void Desligar(){
        ligada = false;
    }

    public void AumentarVolume(){
        if(volume < 30){
            volume++;
        }
    }

    public void DiminuirVolume(){
        if(volume > 0){
            volume--;
        }
    }

    public void AumentarCanal(){
        if(canal < 6){
            canal++;
        }else{
            canal = canal - 5;
        }
    }

    public void DiminuirCanal(){
        if(canal > 1){
            canal--;
        }else{
            canal = canal + 5;
        }
    }
}
