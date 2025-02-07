import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Favor digitar numero da agencia");
        String agencia = sc.nextLine();

        System.out.println("Favor digitar numero da conta");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Favor digitar seu nome");
        String nome = sc.nextLine();

        System.out.println("Favor digitar o saldo que deseja");
        double saldo = sc.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, conta, saldo);

    }
}