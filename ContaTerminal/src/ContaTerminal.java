import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String numero = scanner.next();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo");
        String nomeCompleto = scanner.next();
        
        System.out.println("Digite seu saldo");
        String saldo = scanner.next();

        System.out.println("Olá " + nomeCompleto + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque");

    }
}
