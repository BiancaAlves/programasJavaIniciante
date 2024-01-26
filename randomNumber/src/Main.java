import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);

        for(int i = 1; i <= 5; i++){
            System.out.println("Informe um número de 1 a 100: ");
            Scanner leitura = new Scanner(System.in);
            int number = leitura.nextInt();
            if(number != randomNumber){
                if(i == 5){
                    System.out.println("Você esgotou suas tentativas.");
                }
            } else {
                System.out.println("Parabéns, você acertou o número!");
                 break;
            }
        }
    }
}