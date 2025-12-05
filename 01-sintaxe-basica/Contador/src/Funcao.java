import java.util.Scanner;
public class Funcao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Digite um número maior ou igual a zero! | sair[ex]: ");
            String num = scanner.nextLine();
            if (num.equals("ex")){
                System.out.println("Bye!");
                break;
            }
            float convertido =  conversorNumerico(num);
            if (convertido >= 0){
                float dobro = dobroNumerico(convertido);
                float triplo = triploNumerico(convertido);
                double raiz = raizNumerica(convertido);
                System.out.printf("Seu número: %s\nDobro: %f\nTriplo: %f\nRaiz: %f\n",num, dobro, triplo, raiz);
            }
            else {
                System.out.println("[ERROR] Digite um NÚMERO POSITIVO!");
            }
        }
        scanner.close();
    }
    public static float conversorNumerico(String a){
        try{
            float numero = Float.parseFloat(a);
            return numero;
        } catch (Exception e){
            return -1;
        }

    }
    public static float dobroNumerico(float a){
        return a * 2;
    }
    public static float triploNumerico(float a){
        return a * 3;
    }
    public static double raizNumerica(float a){
        double raiz = Math.sqrt(a);
        return raiz;
    }
}
