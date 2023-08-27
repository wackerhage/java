public class Formatacao {
    public static void main(String[] args) {
        String nome = "João";
        int aulas = 4;

        String mensagem = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para dar o primeiro impulso na programação.
                """.formatted(nome, aulas);
        System.out.println(mensagem);
    }
}
