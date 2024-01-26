import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe um número positivo ou negativo: ");
        Scanner leitura = new Scanner(System.in);
        int number = leitura.nextInt();
        if(number > 0) {
            System.out.println("O número informado é positivo.");
        } else if (number < 0){
            System.out.println("O número informado é negativo.");
        } else {
            System.out.println("O número informado é igual a zero.");
        }

    }
}