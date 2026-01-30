public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // conhecer e importar a classe Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // exibir as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = Double.parseDouble(scanner.nextLine());

        // exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
