package iphone;

import iphone.multifuncional.Celular;

public class Iphone {
    public static void main(String[] args) {
        Celular iphone = new Celular();

        iphone.exibirPagina("www.google.com");
        iphone.atender();
        iphone.tocar();
    }
}
