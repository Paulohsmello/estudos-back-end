public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.print("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal (13);

        System.out.print("Canal Atual : " + smartTv.canal);

        System.out.print("Volume Atual : " +smartTv.volume);

        System.out.print("TV Ligada ? " + smartTv.ligada);
        System.out.print("Canal Atual : " + smartTv.canal);
        System.out.print("Volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.print("Novo Parametro -> TV Ligada ? " + smartTv.ligada);
    }
}
