import java.util.Scanner;

public class ContaTerminal {

    int numeroConta;
    String agencia;
    String nomeTitular;
    float saldo;

    public ContaTerminal(int numeroConta, String agencia, String nomeTitular, float saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception {
        // TODO:
        // Conhecer e impostar a classe scanner
        // Exibir as mensagens para o nosso usuario
        // Obter as informações do usuario
        // Exibir a mensagem de conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = scanner.next();

        System.out.println("Digite o saldo: ");
        float saldo = scanner.nextFloat();

        ContaTerminal conta1 = new ContaTerminal(numeroConta, agencia, nomeTitular, saldo);

        System.out.println("Olá "+ conta1.nomeTitular +", obrigado por criar uma conta em nosso banco, sua agência é "+conta1.agencia+", conta "+conta1.numeroConta+" e seu saldo R$"+conta1.saldo+" já está disponível para saque");

    }
}
