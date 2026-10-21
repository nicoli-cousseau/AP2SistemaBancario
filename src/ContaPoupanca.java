public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular); // repassa para a Conta (mãe)
        this.taxaRendimento = taxaRendimento;
    }

    // Aumenta o saldo em saldo * taxa (ex.: 100 com 0.05 vira 105)
    public void aplicarRendimento() {
        saldo = saldo + saldo * taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}