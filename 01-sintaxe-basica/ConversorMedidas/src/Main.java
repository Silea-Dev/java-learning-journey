import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Escolha o tipo de conversão | m -> cm [1] | m -> mm [2] | m -> hec [3] | m -> km [4] | sair[0]: ");
            String escolha = scanner.nextLine();
            int numfloat = (int)conversorFloat(escolha);
            if (numfloat == 0){
                System.out.println("Bye!");
                break;
            }
            menuControle(numfloat, scanner);
        }
        scanner.close();
    }
    public static void menuControle(int numfloat, Scanner scanner){
        switch (numfloat){
            case 1:
                System.out.println("Você escolheu m -> cm\nDigite o número em metros: ");
                float dadosCm = coletorDados(scanner);
                float resultCm = conversorCm(dadosCm);
                System.out.printf("Resultado %.2fcm\n", resultCm);
                break;
            case 2:
                System.out.println("Você escolheu m -> mm\nDigite o número em metros: ");
                float dadosMm = coletorDados(scanner);
                float resultMm = conversorMm(dadosMm);
                System.out.printf("Resultado %.3fmm\n", resultMm);
                break;
            case 3:
                System.out.println("Você escolheu m -> hec\nDigite o número em metros: ");
                float dadosHc = coletorDados(scanner);
                float resultHc = conversorHec(dadosHc);
                System.out.printf("Resultado %.2fhec\n", resultHc);
                break;
            case 4:
                System.out.println("Você escolheu m -> km\nDigite o número em metros: ");
                float dadosKm = coletorDados(scanner);
                float resultKm = conversorKm(dadosKm);
                System.out.printf("Resultado %.3fkm\n", resultKm);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    public static float coletorDados(Scanner scanner){
        while (true) {
            String numStr = scanner.nextLine();
            float convertido = conversorFloat(numStr);

            if (convertido >= 0){
                return convertido;
            }

            System.out.print("[Erro] Digite um valor numérico positivo: ");
        }
    }
    public static float conversorFloat(String a){
        try {
            float num = Float.parseFloat(a);
            return num;
        }catch (Exception e){
            return -1;
        }
    }
    public static float conversorKm(float a){
        return a / 1000;
    }
    public static float conversorHec(float a){
        return a / 100;
    }
    public static float conversorCm(float a){
        return a * 100;
    }
    public static float conversorMm(float a){
        return a * 1000;
    }
}
