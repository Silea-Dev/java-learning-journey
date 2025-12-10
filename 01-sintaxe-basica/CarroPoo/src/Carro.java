public class Carro {

    private String modelo;
    private String cor;
    private double velocidade = 0;

    public Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    void acelerar() {
        velocidade += 10;
        System.out.printf("Vrum! O %s acelerou. Velocidade atual: %.1f km/h\n", this.modelo, this.velocidade);
    }

    void frear() {
        if (velocidade > 0) {
            velocidade -= 10;
            System.out.printf("Eiiita! O %s freou. Velocidade: %.1f km/h\n", this.modelo, this.velocidade);
        } else {
            System.out.println("O carro já está parado!");
        }
    }

    public void mostrarPainel() {
        // Aqui dentro posso usar direto 'this.modelo' ou 'getModelo()', tanto faz.
        System.out.println("Carro: " + this.modelo + " | Vel: " + this.velocidade);
    }
}