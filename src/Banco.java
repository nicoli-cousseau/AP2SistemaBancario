import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>(); // cria a lista vazia
    }

    // Coloca a conta na lista
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Percorre a lista; se achar o número, devolve a conta; senão, null
    public Conta buscarPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    // Exibe cada conta
    public void listarContas() {
        System.out.println("Contas do " + nome + ":");
        for (Conta conta : contas) {
            conta.exibir();
        }
    }

    // Soma o saldo de todas as contas
    public double saldoTotal() {
        double total = 0;
        for (Conta conta : contas) {
            total = total + conta.getSaldo();
        }
        return total;
    }
}