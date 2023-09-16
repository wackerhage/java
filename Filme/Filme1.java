public class Filme1 {

    private String nome;
    private int anoDeLancamento;
    private double media;
    private boolean incluidoNoPlano;
    private double soma;
    private double nota;
    private int totalDeAvaliacoes;

    public void avaliacao(double nota) {
        soma += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return soma / totalDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSoma() {
        soma += nota;
        return soma;
    }

    public double getMedia() {
        return media;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
