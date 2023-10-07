package audio;

public class Preferencias {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println();
            System.out.println("Voce esta ouvindo: " + audio.getTitulo());
            System.out.println();
            System.out.println("* Este esta nos seus favoritos! *");
            System.out.println();
        } else {
            System.out.println("Voce ouvira em seguida: " + audio.getTitulo());
            System.out.println();
            System.out.println(">>> Adicione aos favoritos!");
        }
    }
}