public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume () {

            volume ++;

    }

    public void diminuirVolume () {

        volume --;

        System.out.print(" Diminuindo o volume para : " + volume);

}


    public void aumentarCanal () {

        canal ++;

    }

    public void diminuirCanal () {

        canal --;

    }

    public void ligar (){

        ligada = true;
    }

    public void desligar () {

        ligada = false;
    }
    
}
