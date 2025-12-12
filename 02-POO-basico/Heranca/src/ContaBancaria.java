public class ContaBancaria {
    private String titular;
    private double saldo = 0;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double converterNumero(String a){
        double convertido = Double.parseDouble(a);
        return convertido;
    }

    public int depositar(double valor){
        if (valor >= 0){
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso!");
            return 0;
        }
        else{
            System.out.println("[ERROR] Não se pode depositar um valor negativo!");
            return -1;
        }
    }

    public int sacar(double valor){
        if(this.saldo - valor >= 0){
            if(valor >= 0){
                this.saldo -= valor;
                System.out.printf("Operação realizada com sucesso!\nSeu novo saldo é: %.2f\n", this.saldo);
                return 0;
            }
            else {
                System.out.println("[ERROR] Por favor, digite um valor POSITIVO!");
                return -1;
            }
        }
        else{
            System.out.printf("[ALERT] Saldo insuficiente!\nSaldo atual: %.2f\n", this.saldo);
            return -1;
        }
    }
}