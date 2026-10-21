public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String titular, double limite) {
        super(numero, titular); // repassa para a Conta (mãe)
        this.limite = limite;
    }

    // Permite sacar até saldo + limite (o saldo pode ficar negativo)
    public boolean sacarComLimite(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }
}