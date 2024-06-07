package phone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void pularProxima() {
        System.out.println("Pulando para a próxima música");
    }

    @Override
    public void voltarAnterior() {
        System.out.println("Voltando para a música anterior");
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada");
    }

    @Override
    public void terminarChamada() {
        System.out.println("Terminando chamada");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void adicionarFavorito(String url) {
        System.out.println("Adicionando " + url + " aos favoritos");
    }
}
