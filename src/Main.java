public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Sky");


        Cliente jackson = new Cliente("Jackson");

        Conta cc = new ContaCorrente(jackson);
        Conta poupanca = new ContaPoupanca(jackson);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        banco.listarClientes();

        cc.depositar(500);

        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }

}
