public class Main {

    public static void main(String[] args) {

        // 1. Criar um Banco
        Banco banco = new Banco("Banco Estudantil");

        // 2. Criar uma conta de cada tipo
        Conta conta = new Conta(1, "Ana");
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, "Bruno", 0.05);
        ContaCorrente contaCorrente = new ContaCorrente(3, "Carla", 500);

        // 3. Adicionar as três ao banco
        banco.adicionarConta(conta);
        banco.adicionarConta(contaPoupanca);
        banco.adicionarConta(contaCorrente);

        // 4. Depósitos e saques
        System.out.println("--- Depósitos e saques ---");
        conta.depositar(200);
        contaPoupanca.depositar(100);
        contaCorrente.depositar(100);
        boolean saqueOk = conta.sacar(50);
        System.out.println("Saque de 50 na conta comum deu certo? " + saqueOk);

        // 5. Saque que falha por saldo insuficiente
        System.out.println("--- Saque que falha ---");
        boolean saqueFalhou = conta.sacar(1000);
        System.out.println("Saque de 1000 na conta comum deu certo? " + saqueFalhou);

        // 6. Rendimento na poupança (antes e depois)
        System.out.println("--- Rendimento ---");
        System.out.println("Saldo da poupança antes: R$ " + contaPoupanca.getSaldo());
        contaPoupanca.aplicarRendimento();
        System.out.println("Saldo da poupança depois: R$ " + contaPoupanca.getSaldo());

        // 7. Saque com limite na conta corrente (saldo fica negativo)
        System.out.println("--- Saque com limite ---");
        boolean saqueLimite = contaCorrente.sacarComLimite(400);
        System.out.println("Saque de 400 com limite deu certo? " + saqueLimite);
        System.out.println("Saldo da corrente: R$ " + contaCorrente.getSaldo());
        
        // Extra: buscar conta pelo número (usa o buscarPorNumero do Banco)
        System.out.println("--- Buscar conta ---");
        Conta contaEncontrada = banco.buscarPorNumero(2);
        if (contaEncontrada != null) {
            contaEncontrada.exibir();
        }
        Conta contaInexistente = banco.buscarPorNumero(99);
        if (contaInexistente == null) {
            System.out.println("Conta 99 não encontrada.");
        }

        // 8. Listar todas as contas e mostrar o saldo total
        System.out.println("--- Todas as contas ---");
        banco.listarContas();
        System.out.println("Saldo total do banco: R$ " + banco.saldoTotal());
    }
}