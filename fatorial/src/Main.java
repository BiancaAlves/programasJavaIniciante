import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        Scanner lerNumero = new Scanner(System.in);
        int num = lerNumero.nextInt();
        int fatorial = num - 1;

        for(int i = num; i > 2; --i){
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }

        System.out.println("O fatorial de " + num + " é " + fatorial + ".");
    }
}