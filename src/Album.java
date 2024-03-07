import java.util.ArrayList;
import java.util.List;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;

    private List<Musica> musicas;

    public Album(){

    }

    public Album(String genero, int ano, String nome, Pessoa artista) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getArtista() {
        return artista;
    }

    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void addMusica(Musica m)
    {
        musicas.add(m);
    }

    public void mostrarTodosOsDados()
    {
        String res = "genêro -> "+ genero + ", " + "ano -> "+ ano + ", " + "nome -> "+  nome + ", " + "artista -> "+ artista.getNome();
        for (Musica musica: musicas) {
            res += "\n - " + musica.getTitulo()+ ", " + musica.getCompositor().getNome();
        }
        System.out.println(res);
    }
}
