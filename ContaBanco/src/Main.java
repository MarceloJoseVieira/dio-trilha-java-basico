import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ContaTerminal contaTerminal = new ContaTerminal();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da Conta:");
        contaTerminal.setNumeroConta(sc.nextInt());

        sc.nextLine();

        System.out.println("Digite o número da Agência:");
        contaTerminal.setAgencia(sc.nextLine());

        System.out.println("Digite seu nome:");
        contaTerminal.setNomeCliente(sc.nextLine());

        System.out.println("Digite seu saldo:");
        contaTerminal.setSaldo(sc.nextDouble());

        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.getAgencia() + ", conta " + contaTerminal.getNumeroConta() + " e seu saldo " + contaTerminal.getSaldo() + " já está disponível para saque");
    }
}
