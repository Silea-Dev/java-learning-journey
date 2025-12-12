import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bem-vindo ao Tubank!\nDigite seu Nome | Encerrar [0]");
            String escolha = scanner.nextLine();
            if (escolha.equals("0")) {
                System.out.println("Obrigado pela preferência! Volte sempre!");
                break;
            }
            iniciar(scanner, escolha);
        }
        scanner.close();
    }
    public static void iniciar(Scanner scanner, String escolha) {
        ContaPoupanca minhaPoupanca = new ContaPoupanca(escolha, 0);
        System.out.printf("Bem-vindo %s!\n", escolha);

        while (true) {
            System.out.println("Escolha o que deseja fazer: Sacar [1] | Depositar [2] | Verificar Saldo [3] | Conta Poupança [4] |Voltar [0]: ");
            String decisao = scanner.nextLine();
            if (decisao.equals("0")) {
                System.out.println("Encerrando sessão...");
                break;
            }
            switch (decisao) {
                case "1":
                    System.out.println("Digite o valor a ser Sacado: ");
                    String valorSaStr = scanner.nextLine();
                    double valorSaDou = minhaPoupanca.converterNumero(valorSaStr);
                    minhaPoupanca.sacar(valorSaDou);
                    break;
                case "2":
                    System.out.println("Digite o valor a ser Depositado: ");
                    String valorDeStr = scanner.nextLine();
                    double valorDeDou = minhaPoupanca.converterNumero(valorDeStr);
                    minhaPoupanca.depositar(valorDeDou);
                    System.out.printf("Seu saldo é: %.2f\n", minhaPoupanca.getSaldo());
                    break;
                case "3":
                    System.out.printf("Titular: %s\nSaldo: %.2f\n", minhaPoupanca.getTitular(), minhaPoupanca.getSaldo());
                    break;
                case "4":
                    System.out.println("Saldo Inicial: " + minhaPoupanca.getSaldo());
                    System.out.println("\n--- Aplicando Rendimento ---");
                    minhaPoupanca.renderJuros();
                    System.out.println("Saldo Final: " + minhaPoupanca.getSaldo());
                    break;
                default:
                    System.out.println("[ERROR] Opção inválida!");
            }
        }
    }
}