public class Musica {
    private String titulo;
    private int duracao;
    private Pessoa compositor;


    public Musica(){

    }

    public Musica(String titulo, int duracao, Pessoa compositor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica(){
        System.out.println("tocando a música " + titulo + " de " + compositor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Pessoa getCompositor() {
        return compositor;
    }

    public void setCompositor(Pessoa compositor) {
        this.compositor = compositor;
    }
}
