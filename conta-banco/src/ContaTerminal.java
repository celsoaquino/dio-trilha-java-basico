
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta!");
        conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextDouble();

        scanner.close();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco,\n"
                + "sua agência é %s, conta %d e seu saldo R$%.2f. já está disponível para saque.",
                nomeCliente, agencia, conta, saldo);

        System.out.println(mensagem);
    }
}
