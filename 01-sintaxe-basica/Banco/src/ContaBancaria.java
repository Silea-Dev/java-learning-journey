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
        double convertido = Float.parseFloat(a);
        return convertido;
    }

    public void depositar(double valor){
        if (valor >= 0){
            this.saldo += valor;
        }
        else{
            System.out.println("[ERROR] Não se pode depositar um valor negativo!");
        }
    }

    public void sacar(double valor){

    }

    public void verExtrato(){
        System.out.printf("Titular: &s\nSaldo: %f\n", this.titular, this.saldo);
    }
}
