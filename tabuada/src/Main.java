import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe um número para ver a tabuada: ");
        Scanner inputNumber = new Scanner(System.in);
        double numero = inputNumber.nextDouble();

        for(int i = 1; i <= 10; i++){
            double calc = numero * i;
            System.out.println(((numero == numero) ? (int) numero : numero) + " x " + i + " = " + ((calc == calc) ? (int) calc : calc));
        }
    }
}