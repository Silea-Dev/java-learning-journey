import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Tabuada!");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digite um número inteiro positivo | sair [ex]: ");
            String escolha = scanner.nextLine();
            if(escolha.equals("ex")){
                System.out.println("Bye!");
                break;
            }
            int numeroConvertido = conversorNumerico(escolha);
            if (numeroConvertido >= 0){
                tabuada(numeroConvertido);
            }
            else {
                System.out.println("[ERROR] Digite um NÚMERO INTEIRO POSITIVO!");
            }
        }
        scanner.close();
    }

    public static int conversorNumerico(String a){
        try{
            int numero = Integer.parseInt(a);
            return numero;
        }catch (Exception e){
            return -1;
        }
    }

    public static void tabuada(int a){
        for(int n = 0; n <= 10; n++){
            System.out.printf("%d x %d = %d\n", a, n, a * n);
        }
    }
}