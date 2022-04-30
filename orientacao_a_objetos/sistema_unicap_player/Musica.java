package sistema_unicap_player;

public class Musica implements Audio{

    private ArtistaSolo artista;
    private Banda banda;
    private String genero;
    private String letra;
    private double duracao;
    private String titulo;

    public Musica(double duracao, String titulo, ArtistaSolo artista, String letra, String genero) {
        this.duracao = duracao;
        this.artista = artista;
        this.genero = genero;
        this.letra = letra;
    }

    public void exibirInformacoes(){
        System.out.println("Título=" + this.getTitulo()
                            + "Artista=" + this.getArtista()
                            + "Gênero=" + this.getGenero()
                            + "Letra=" + this.getLetra());
    }

    @Override
    public void mudarDuracao(double tempo, double estadoAtual) {
        if(tempo < this.getDuracao()) {
            tempo = estadoAtual + tempo;
            this.setDuracao(tempo);
        }
    }

    @Override
    public void buscarDados() {
        System.out.println(this.getArtista().getNome());
    }

    @Override
    public ArtistaSolo exibirProdutor() {
        return this.getArtista();
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }

    public ArtistaSolo getArtista() {
        return artista;
    }

    public void setArtista(ArtistaSolo artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
