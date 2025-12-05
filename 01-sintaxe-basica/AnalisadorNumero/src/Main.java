import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro!");
        try{
            int numero = scanner.nextInt();
            teste(numero);
        }catch (Exception e){
            System.out.println("[ERROR] Digite um número INTEIRO!");
            scanner.next();
        }
        scanner.close();
    }
    public static void teste(int a){
        int sucessor = a + 1;
        int antecessor = a - 1;
        System.out.printf("O sucessor é %d\nO antecessor é %d", sucessor, antecessor);
    }
}