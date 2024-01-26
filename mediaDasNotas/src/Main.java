import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Criação de objeto que captura os dados. Um único objeto scanner é suficiente para ler todos os dados.

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine(); // Captura os dados digitados na próxima linha

        // Para ler valores inteiros, é utilizado o nextInt():

        System.out.println("Digite o ano de lançamento: ");
        int ano = leitura.nextInt();

        // Para ler valores decimais, é utilizado o nextDouble():
        System.out.println("Digite a avaliação: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme informado" + filme); // Exibe o filme informado
        System.out.println("Ano informado: " + ano); // Exibe o ano informado
        System.out.println("Avaliação informada: " + avaliacao); // Exibe a avaliação informada
    }
}