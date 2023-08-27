public class TemperaturaCelciusParaFahrenheit {
    public static void main(String[] args) {
        double temperaturaCelcius = 30;

        double temperaturaFahrenheit = (30 * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celcius é equivalente a %f Fahrenheit.", temperaturaCelcius, temperaturaFahrenheit);

        System.out.println(mensagem);

        int mensagemInt = (int) temperaturaFahrenheit;

        System.out.println("A temperatura em Fahrenheit inteira é: " + mensagemInt + " F");
    }
}
