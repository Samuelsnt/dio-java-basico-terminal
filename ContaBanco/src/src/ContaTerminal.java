package src;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 1543.22;
        //Se o saldo for muito extenso, recomenda-se alteração.
        
        System.out.println("Por favor, digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite a sua agencia ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();
        

        System.out.println("Agora, seu sobrenome: ");
        String sobrenomeCliente = scanner.next();


        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + ",obrigado por criar uma conta em nosso banco, sua agencia é "
         + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}



