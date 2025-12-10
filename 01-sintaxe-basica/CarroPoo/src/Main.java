import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digite Qualquer tecla para iniciar | sair[ex]: ");
            String escolha = scanner.nextLine();
            if (escolha.equals("ex")){
                System.out.println("Bye!");
                break;
            }
            iniciar(scanner);
        }
        scanner.close();
    }

    public static void iniciar(Scanner scanner){
        System.out.println("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.println("Digite a cor do carro: ");
        String cor = scanner.nextLine();
        Carro veiculo = new Carro(modelo, cor);
        System.out.printf("Modelo: %s,Cor: %s\n", modelo, cor);
        while (true){
            System.out.println("Acelerar [1] | Freiar [2] | Mostrar Painel [3] | Voltar [ex]");
            String escolhido = scanner.nextLine();
            if (escolhido.equals("ex")){
                System.out.println("Voltando...");
                break;
            }
            switch (escolhido){
                case "1":
                    veiculo.acelerar();
                    break;
                case "2":
                    veiculo.frear();
                    break;
                case "3":
                    veiculo.mostrarPainel();
                    break;
            }
        }
    }
}