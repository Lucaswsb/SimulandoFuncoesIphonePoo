package iphone.multifuncional;

import iphone.aparelhotelefonico.Telefone;
import iphone.navegadorinternet.Safari;
import iphone.reprodutormusical.Ipod;

public class Celular implements Telefone, Safari, Ipod {

    @Override
    public void conferirSinal() {
        System.out.println("Conferindo sinal pelo Iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "atraves do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url + " atraves do iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba atraves do iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina atraves do iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica atraves do Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando atraves do Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando " + musica + " atraves do Iphone");
    }
}
