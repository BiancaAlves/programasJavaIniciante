import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe o primeiro número: ");
        Scanner leituran1 = new Scanner(System.in);
        int n1 = leituran1.nextInt();

        System.out.println("Informe o segundo número: ");
        Scanner leituran2 = new Scanner(System.in);
        int n2 = leituran2.nextInt();

        if(n1 == n2){
            System.out.println("Os números são iguais.");
        } else if(n1 > n2){
            System.out.println("Os números são diferentes e o primeiro é maior que o segundo.");
        } else {
            System.out.println("Os números são diferentes e o segundo é maior que o primeiro.");
        }
    }
}