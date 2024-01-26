import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();

        if(num % 2 == 0){
            System.out.println("Esse número é par.");
        } else {
            System.out.println("Esse número é ímpar.");
        }
    }
}