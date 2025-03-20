import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência! ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o código da Agência! ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome! ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo! ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
