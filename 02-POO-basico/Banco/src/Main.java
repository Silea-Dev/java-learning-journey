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
        ContaBancaria banco = new ContaBancaria(escolha, 0);
        System.out.printf("Bem-vindo %s!\n", escolha);
        while (true) {
            System.out.println("Escolha o que deseja fazer: Sacar [1] | Depositar [2] | Verificar Saldo [3] | Voltar [0]: ");
            String decisao = scanner.nextLine();
            if (decisao.equals("0")) {
                System.out.println("Encerrando sessão...");
                break;
            }
            switch (decisao) {
                case "1":
                    System.out.println("Digite o valor a ser Sacado: ");
                    String valorSaStr = scanner.nextLine();
                    double valorSaDou = banco.converterNumero(valorSaStr);
                    banco.sacar(valorSaDou);
                    break;
                case "2":
                    System.out.println("Digite o valor a ser Depositado: ");
                    String valorDeStr = scanner.nextLine();
                    double valorDeDou = banco.converterNumero(valorDeStr);
                    banco.depositar(valorDeDou);
                    System.out.printf("Seu saldo é: %.2f\n", banco.getSaldo());
                    break;
                case "3":
                    System.out.printf("Titular: %s\nSaldo: %.2f\n", banco.getTitular(), banco.getSaldo());
                    break;
                default:
                    System.out.println("[ERROR] Opção inválida!");
            }
        }
    }
}
