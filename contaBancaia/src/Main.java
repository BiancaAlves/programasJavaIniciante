import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldoInicial = 2000;

        System.out.println("**************************************");
        System.out.println("Dados iniciais do cliente: \n\n");
        System.out.println("Nome: Bianca Alves Dos Santos");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("**************************************\n\n");

        System.out.println("Operações: \n\n");

        System.out.println("1. Consultar saldos");
        System.out.println("2. Receber valor");
        System.out.println("3. Transferir valor");
        System.out.println("4. Sair");

        Scanner optionReader = new Scanner(System.in);
        int option = optionReader.nextInt();

        switch (option){
            case 1:
                System.out.println("Seu saldo atual é: " + saldoInicial);
                break;
            case 2:
                System.out.println("Informe o valor a ser depositado: ");
                Scanner depositoValorReader = new Scanner(System.in);
                double depositoValor = depositoValorReader.nextDouble();
                saldoInicial += depositoValor;
                System.out.println("Seu saldo atual é: " + saldoInicial);
                break;
            case 3:
                System.out.println("Informe o valor a ser transferido: ");
                Scanner transferValorReader = new Scanner(System.in);
                double transferValor = transferValorReader.nextDouble();
                if(transferValor > saldoInicial){
                    System.out.println("Saldo insuficiente para transferir esse valor.");
                    break;
                } else {
                    saldoInicial -= transferValor;
                    System.out.println("Seu saldo atual é: " + saldoInicial);
                }
                break;
            default:
                break;
        }
    }
}