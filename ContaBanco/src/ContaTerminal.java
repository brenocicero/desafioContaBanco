import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        double saldo = 400.78;

        System.out.println("Por favor, nos informe seu nome:");
        String nome = sc.nextLine();  // Captura o nome completo com acentuação

        System.out.println("Agora, digite o número da Agência:");
        String agencia = sc.next();  // Captura o número da agência

        System.out.println("E por último, digite o número da conta:");
        int conta = sc.nextInt();  // Captura o número da conta

        // Exibe a mensagem com as informações fornecidas
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
            "sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + 
            " já está disponível para saque!!");

        sc.close();
    }
}
