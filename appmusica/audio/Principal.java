package audio;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Champion Of the World");
        minhaMusica.setTotalReproducoes(5000);
        minhaMusica.setTotalCurtidas(3000);
        minhaMusica.setClassificacao(5);

        for (int i = 0; i <= 9; i++) {
            minhaMusica.curte();
        }

        for (int i = 0; i <= 9; i++) {
            minhaMusica.reproduzir();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("Como se tornar um dev. em Java");
        meuPodcast.setTotalReproducoes(2);
        meuPodcast.setTotalCurtidas(59);
        meuPodcast.setClassificacao(5);

        for (int i = 0; i <= 9; i++) {
            meuPodcast.curte();
        }

        for (int i = 0; i <= 9; i++) {
            meuPodcast.reproduzir();
        }

        Preferencias minhasPreferidas = new Preferencias();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);

    }
}
