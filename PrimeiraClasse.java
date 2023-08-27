// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.8;

        double media = (8.0 + 6.0 + 10) /3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com o galã dos anos 80
                Muito bom!
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) media/2;
        System.out.println(classificacao);
        }
    }
