package sistema_unicap_player;

public class Podcast implements Audio{

    private double duracao;
    private String titulo;
    private String genero;
    private String produtor;

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public void exibirInformacoes(){
        System.out.println("Título=" + this.getTitulo()
                + "Duração=" + this.getDuracao()
                + "Gênero=" + this.getGenero());
    }

    @Override
    public void mudarDuracao(double tempo, double estadoAtual) {

    }

    @Override
    public void buscarDados() {

    }

    @Override
    public ArtistaSolo exibirProdutor() {
        return null;
    }


}
