import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

// projeto:
// criar uma lista de números inteiros, receber os números digitados pelo usuário e ao final, mostrar os números
// armazenados e a soma total desses números.

public class Lista030923 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<>();

        int i = 1;
        int recebeValor;
        int soma = 0;

        for (i = 1; i < 4; i++) {
            System.out.println("Digite o numero");
            recebeValor = leitura.nextInt();
            array.add(String.valueOf(recebeValor));
            System.out.println(array);
            soma += Integer.parseInt(String.valueOf(recebeValor));

        }

        System.out.println("\nOs numeros dessa lista sao: ");
        System.out.println(array);
        System.out.println("\nA soma dos numeros da lista é: ");
        System.out.println(soma);
        }
    }
