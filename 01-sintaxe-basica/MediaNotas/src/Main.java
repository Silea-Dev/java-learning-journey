import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scannerPrincipal = new Scanner(System.in);
        while (true){
            iniciarPrograma(scannerPrincipal);
            System.out.println("Sair[ex] | Continuar [Qualquer Tecla]: ");
            String escolhido = scannerPrincipal.nextLine();
            if(escolhido.equals("ex")){
                System.out.println("Bye!");
                break;
            }
        }
        scannerPrincipal.close();
    }
    public static void iniciarPrograma(Scanner leitor){
        double[] notas = new double[3];
        for(int i = 0; i < 3; i++){
            System.out.printf("Digite sua %dª nota: \n", i + 1);
            String notaStr = leitor.nextLine();
            double convertido = conversorNumerico(notaStr);
            if (convertido >= 0){
                notas[i] = convertido;
                System.out.printf("Nota %d: %.1f\n", i + 1, convertido);
            }
            else {
                System.out.println("[ERROR] Digite um NÚMERO POSITIVO!");
                i--; // O TRUQUE: "Volte uma casa no tabuleiro e pergunte de novo"
            }
        }
        double resultado = mediaNumerica(notas);
        System.out.printf("a Média de suas notas: %.2f\n", resultado);
    }
    public static double conversorNumerico(String a){
        try{
            double numero = Double.parseDouble(a);
            return numero;
        }catch (Exception e){
            return -1;
        }
    }
    public static double mediaNumerica(double[] notas){
        double soma = 0;
        for (double n : notas){
            soma += n;
        }
        double media = soma / notas.length;
        return media;
    }
}
