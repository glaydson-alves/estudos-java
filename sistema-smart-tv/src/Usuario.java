public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("tv ligada? " + smartTv.ligado);

        System.out.println("o canal atual é : " + smartTv.canal);

        smartTv.mudarCanal(67);

        System.out.println("o canal atual é : " + smartTv.canal);
        
        System.out.println("o volume atual é : " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.ligar();
        System.out.println(" sua tv está ligada ? " + smartTv.ligado);
    }
}
