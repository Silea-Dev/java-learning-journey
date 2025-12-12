public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override // "Etiqueta" que confirma: Estamos alterando o comportamento original
    public int sacar(double valor) {

        double taxa = 5.00;
        double valorComTaxa = valor + taxa;

        System.out.println("--- [Aviso] Saque em Poupança: Taxa de R$ 5,00 aplicada ---");

        return super.sacar(valorComTaxa);
    }

    public void renderJuros() {
        double saldoAtual = this.getSaldo();

        double rendimento = saldoAtual * 0.10;

        this.depositar(rendimento);

        System.out.printf("Juros de R$ %.2f aplicados com sucesso!\n", rendimento);
    }
}