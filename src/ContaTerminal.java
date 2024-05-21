import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

    }
}
