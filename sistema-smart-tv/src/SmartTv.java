public class SmartTv {
    Boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println(canal);
    }

    public void mininuirCanal(){
        canal--;
        System.out.println(canal);
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("aumentando volume: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("diminuindo volume: " + volume);
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }
}
