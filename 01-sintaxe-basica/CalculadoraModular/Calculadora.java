import java.util.Scanner;
import java.util.InputMismatchException; // Importante para diferenciar os erros

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop Principal (Menu)
        while (true) {
            System.out.println("\n=== CALCULADORA JAVA ===");
            System.out.println("Escolha: [+] [-] [*] [/] ou [0] para Sair");

            // Lendo o char (com tratamento básico para não quebrar se digitar vazio)
            String input = scanner.next();
            char escolha = input.charAt(0);

            if (escolha == '0') {
                System.out.println("Bye!");
                break; // Sai do Loop Principal
            }

            // A ESTRUTURA SWITCH (Ideal para menus)
            switch (escolha) {
                case '+': // 1. É '+'? Se sim, entra aqui. Não tem código nem break.
                    //    O Java "cai" para a linha de baixo.
                case '-': // 2. É '-'? Se sim, entra aqui. O Java "cai" para baixo.
                case '*': // 3. É '*'? ... cai para baixo.
                case '/': // 4. É '/'? ... cai para baixo.

                    // 5. AQUI é onde todos os casos acima vão parar!
                    // Como todos eles queriam fazer a mesma coisa (chamar o método operar),
                    // eu empilhei os casos para não repetir código.
                    operar(scanner, escolha);

                    break; // 6. O FREIO DE MÃO.
                // Aqui o Java para e sai do switch. Se esquecer isso,
                // ele continuaria descendo e executaria o 'default' também!

                default: // 7. É o "else" final. Se não for nenhum dos acima, cai aqui.
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close(); // 1. O lugar correto do close é AQUI
    }

    // EXTRA: Criei um método para não repetir o código 4 vezes (DRY - Don't Repeat Yourself)
    public static void operar(Scanner scanner, char operacao) {
        while (true) {
            try {
                System.out.printf("[%c] Digite o 1º n | voltar[0]: ", operacao);
                float n1 = scanner.nextFloat();

                if (n1 == 0) break; // Volta para o menu principal

                System.out.printf("[%c] Digite o 2º n: ", operacao);
                float n2 = scanner.nextFloat();

                float resultado = 0;

                // Decide qual conta fazer
                switch (operacao) {
                    case '+': resultado = Soma.somar(n1, n2); break;
                    case '-': resultado = Subtracao.subtrair(n1, n2); break;
                    case '*': resultado = Produto.multiplicar(n1, n2); break;
                    case '/': resultado = Quociente.divisao(n1, n2); break;
                }

                System.out.printf("Resultado: %.2f %c %.2f = %.2f\n", n1, operacao, n2, resultado);

            } catch (InputMismatchException e) {
                // Erro de digitação (letra em vez de número)
                System.out.println("[Erro] Você digitou letras! Use apenas números.");
                scanner.nextLine(); // Limpa buffer

            } catch (Exception e) {
                // 3. Erro de Lógica (Divisão por zero)
                // Pega a mensagem que veio lá da classe Quociente
                System.out.println("[Erro] " + e.getMessage());
            }
        }
    }
}