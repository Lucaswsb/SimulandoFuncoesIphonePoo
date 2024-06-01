package iphone.navegadorinternet;

public class Internet implements Safari{

    @Override
    public void exibirPagina(String url) {
        url = "www.google.com";
        System.out.println("Acessando: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
