import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        System.out.println(" *********************** \n Dados iniciais do cliente: \n Nome: Dominique Wackerhage");
        System.out.println(" Tipo conta: Corrente \n Saldo inicial: R$ 2500,00 \n *********************** \n");
        System.out.println(" Operações \n\n 1- Consultar saldos \n 2- Receber valor \n 3- Transferir valor \n 4- Sair");
        System.out.println(" \n Digite a opção desejada:");

        double saldo = 2500.00;

        double recebeValor = 0;
        int escolha = 0;
        int numeroDigitado = 0;

        saldo += recebeValor;

        while (numeroDigitado != 4) {

            Scanner leitura = new Scanner(System.in);
            numeroDigitado = leitura.nextInt();

            switch (numeroDigitado) {
                case 1 -> {
                    System.out.println("Seu saldo é de " + saldo);
                    break;
                }
                case 2 -> {
                    System.out.println("Informe o valor a ser depositado: ");
                    recebeValor = leitura.nextDouble();
                    saldo += recebeValor;
                    System.out.println("O valor de R$ " + recebeValor + " foi depositado na sua conta bancária.");
                    System.out.println("Seu novo saldo é R$" + saldo);
                    break;
                }
                case 3 -> {
                    System.out.println("Informe o valor a ser transferido: ");
                    recebeValor = leitura.nextDouble();
                    saldo -= recebeValor;
                    System.out.println("O valor de R$ " + recebeValor + " foi transferido da sua conta bancária.");
                    System.out.println("Seu novo saldo é R$" + saldo);
                    break;
                }
                case 4 -> {
                    System.out.println("Ate mais!");
                    break;
                }
                default -> {
                    System.out.println("Valor incorreto! Tente novamente.");
                    break;
                }
            }
        }
    }
}
