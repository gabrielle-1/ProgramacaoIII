package sistema_unicap_player;

public interface Audio {

    void exibirInformacoes();
    ArtistaSolo exibirProdutor();
    void mudarDuracao(double tempo, double estadoAtual);
    void buscarDados();
}
