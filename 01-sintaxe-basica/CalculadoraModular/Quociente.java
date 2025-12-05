public class Quociente {
    public static void main(String[] args) {
    }

    // 1. Remova o acento do nome do método (Boa prática: divisao)
    public static float divisao(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            // A SOLUÇÃO: Em vez de return, usamos throw (lançar erro)
            throw new IllegalArgumentException("[ERROR] Digite um divisor diferente de zero!");
        }
    }
}