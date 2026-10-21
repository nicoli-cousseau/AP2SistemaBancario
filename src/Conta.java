public class Conta {

    // Atributos (- = private, # = protected)
    private int numero;
    private String titular;
    protected double saldo;

    // Construtor
    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0; // começa em zero
    }

    // Só deposita se o valor for maior que zero
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Só saca se valor > 0 e valor <= saldo
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    // Getters (não existem setters de numero/titular: não mudam depois)
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Imprime os dados da conta
    public void exibir() {
        System.out.println("Conta: " + numero + " | Titular: " + titular + " | Saldo: R$ " + saldo);
    }
}