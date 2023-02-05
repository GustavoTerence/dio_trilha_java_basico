import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv ();

        Scanner scanner = new Scanner(System.in);

        smartTv.aumentarVolume();

        System.out.print("Tv ligada ? " + smartTv.ligada);
        System.out.print(" Canal ? " + smartTv.canal);          
        System.out.print(" volume ? " + smartTv.volume);

        smartTv.ligar();

        System.out.print(" Novo Tv ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.print(" volume atual ? " + smartTv.volume);



        System.out.print(" Selecione o Canal"); 
        int canal = scanner.nextInt();

        System.out.print(canal);
    }
}
