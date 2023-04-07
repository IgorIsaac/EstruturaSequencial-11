import java.util.Scanner;

public class CalculadoraNumeros {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o primeiro número inteiro
        System.out.print("Digite o primeiro número inteiro: ");
        int numInt1 = scanner.nextInt(); // Lê o primeiro número inteiro digitado pelo usuário

        // Solicitar ao usuário que insira o segundo número inteiro
        System.out.print("Digite o segundo número inteiro: ");
        int numInt2 = scanner.nextInt(); // Lê o segundo número inteiro digitado pelo usuário

        // Solicitar ao usuário que insira o número real
        System.out.print("Digite um número real: ");
        double numReal = scanner.nextDouble(); // Lê o número real digitado pelo usuário

        // Realizar os cálculos
        double resultadoA = (numInt1 * 2) * (numInt2 / 2.0);
        double resultadoB = (numInt1 * 3) + numReal;
        double resultadoC = Math.pow(numReal, 3);

        // Exibir os resultados
        System.out.println("Resultado a) O produto do dobro do primeiro com metade do segundo: " + resultadoA);
        System.out.println("Resultado b) A soma do triplo do primeiro com o terceiro: " + resultadoB);
        System.out.println("Resultado c) O terceiro elevado ao cubo: " + resultadoC);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
