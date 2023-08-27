import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Adivinhe o número: ");
            int numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Você acertou!");
                break;
            } else if (numeroDigitado < numeroGerado) System.out.println("O numero gerado é maior!");
            else System.out.println("O numero gerado é menor!");
        }
        if (tentativas == 5) System.out.println("Você atingiu o limite de tentativas!");
    }
}