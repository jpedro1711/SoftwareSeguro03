import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o genero do album");
        String generoAlbum = sc.nextLine();

        System.out.println("Digite o ano do album");
        int anoAlbum = sc.nextInt();

        System.out.println("Digite o nome do album");
        sc.nextLine();
        String nomeAlbum = sc.nextLine();

        System.out.println("Digite o nome do artista");
        String nomeArtista = sc.nextLine();
        System.out.println("Digite a idade do artista");
        int idadeArtista = sc.nextInt();

        Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, new Pessoa(nomeArtista, idadeArtista));

        boolean addMusica = true;

        while (addMusica)
        {
            System.out.println("Digite uma opção: \n1- Adicionar música \n2- Finalizar");
            int option = sc.nextInt();
            if (option == 2)
            {
                addMusica = false;
            }
            else
            {
                sc.nextLine();

                System.out.println("Digite o título da música");
                String tituloMusica = sc.nextLine();
                System.out.println("Digite a duração da música");
                int duracao = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome do compositor");
                String nomeCompositor = sc.nextLine();
                System.out.println("Digite a idade do compositor");
                int idadeCompositor = sc.nextInt();
                sc.nextLine();

                Pessoa compositor = new Pessoa(nomeCompositor, idadeCompositor);

                Musica musica = new Musica(tituloMusica, duracao, compositor);

                album.addMusica(musica);
            }
        }

        album.mostrarTodosOsDados();
        sc.close();
    }
}