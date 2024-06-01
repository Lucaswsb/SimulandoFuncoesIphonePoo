package iphone.reprodutormusical;

public class musica implements Ipod{

    @Override
    public void tocar(){
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        musica = "aaaa";
        System.out.println("Tocando " + musica);
    }
}
