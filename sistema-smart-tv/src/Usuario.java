public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv ();

        System.out.print("Tv ligada ? " + smartTv.ligada);
        System.out.print(" Canal ? " + smartTv.canal);          
        System.out.print(" volume ? " + smartTv.volume);

        smartTv.ligar();

        System.out.print(" Novo Tv ligada ? " + smartTv.ligada);
    }
}
