package iphone.aparelhotelefonico;

public class ligacao implements Telefone {

    @Override
    public void conferirSinal() {
        System.out.println("Sinal ok!");
    }

    @Override
    public void ligar(String numero) {
        conferirSinal();
        numero = "98312314";
        System.out.println("Ligando para " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo ligacação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
