public class Senha {
    public static void main(String[] args) {
        String senha = "123456";

        if (senha.equals("123456")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
/*
Nesse caso, o método equals() é utilizado para comparar o conteúdo da variável senha com
a String "12345". Se as duas Strings forem iguais, a mensagem "Acesso autorizado!" será
impressa, caso contrário, a mensagem "Senha incorreta." será impressa.
 */
}