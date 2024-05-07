import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir mensagens para o usuário
        //Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite sua Agência: ");
        String numeroAgencia = scanner.next();
     
        System.out.println("Por favor, insira seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, insira seu Sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, insira seu saldo");
        double saldoConta = scanner.nextDouble();

        
        //Exibir mensagem conta criada
        System.out.println("Olá " + nomeCliente.concat(" ").concat(sobrenomeCliente)+ ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
                            ", conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível para saque.");
        scanner.close();   

    }
}
