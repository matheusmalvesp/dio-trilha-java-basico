import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: import Scanner
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        //Exibir as mensagens para o usuário e obter informações pelo Scanner
        System.out.println("Por favor, informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite os 04 números da agência com dígito, seguindo o padrão xxxx-x: ");
        String agencia = scanner.next();

        System.out.println("Agora, por gentileza, informe o seu nome");
        String nome = scanner.next();

        double saldo = 0.0;
        System.out.println("Insira o valor de depósito inicial: ");
        saldo = scanner.nextDouble();
        

        //Exibir a mensagem de conta criada        
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta  " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        //é necessário fechar o scanner após o uso
        scanner.close();
    }
}
