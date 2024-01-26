import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos calcular a área de uma forma geométrica.");
        System.out.println("Informe 1 para quadrado e 2 para círculo: ");
        Scanner leituraForma = new Scanner(System.in);
        int formaEscolhida = leituraForma.nextInt();

        if(formaEscolhida == 1){
            System.out.println("Informe a largura/altura do quadrado: ");
            Scanner tamanhoQuadrado = new Scanner(System.in);
            double dadoQuadrado = tamanhoQuadrado.nextDouble();
            dadoQuadrado *= dadoQuadrado;
            System.out.println("A área do quadrado é: " + dadoQuadrado);
        } else if (formaEscolhida == 2){
            System.out.println("Informe o raio do círculo: ");
            Scanner raioCirculo = new Scanner(System.in);
            double dadoCirculo = raioCirculo.nextDouble();
            dadoCirculo = 3.14 * (dadoCirculo * dadoCirculo);
            System.out.println("A área do círculo é: " + dadoCirculo);
        } else {
            System.out.println("O valor informado é inválido. Informe 1 ou 2.");
        }
    }
}