public class Principal1 {
    public static void main(String[] args) {
        Filme1 meuFilme = new Filme1();

        meuFilme.setNome("Wall-e");
        meuFilme.setAnoDeLancamento(2015);
        meuFilme.avaliacao(10);
        meuFilme.avaliacao(8.0);
        meuFilme.avaliacao(5.5);

        System.out.println();
        System.out.println(
                "O Filme " + meuFilme.getNome() + " tem um total de " + meuFilme.getTotalDeAvaliacoes() + " notas.");
        System.out.println();
        System.out.println("Esta é a media das notas do filme: " + meuFilme.pegaMedia());
        System.out.println();
        System.out.println("Este é o total de notas do filme: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println();
    }

}
