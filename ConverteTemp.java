import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌡️ Bem-vindo ao meu Conversor de Temperaturas!");
        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Digite 1 ou 2: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em °C: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f°C é igual a %.2f°F\n", celsius, fahrenheit);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em °F: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.2f°F é igual a %.2f°C\n", fahrenheit, celsius);
        } else {
            System.out.println("Opção inválida! ❌");
        }

        scanner.close();
    }
}
