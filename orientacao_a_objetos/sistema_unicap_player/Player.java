package sistema_unicap_player;

public class Player {

    private boolean tocando;
    private double estadoAtual;
    private Audio[] audio;

    public void verInformacoes() {
        this.audio[0].exibirInformacoes();
    }

    public void avancar(double tempoAvanco) {
        this.audio[0].mudarDuracao(tempoAvanco, estadoAtual);
    }

    public void voltar(double tempo, double estadoAtual) {
        this.audio[0].mudarDuracao(tempo, estadoAtual);
    }

    public void play() {
        if (this.tocando == false)
            this.tocando = true;
    }

    public void pause() {
        if (this.tocando == true)
            this.tocando = false;
    }
}
