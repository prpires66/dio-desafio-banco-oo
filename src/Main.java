
public class Main {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");

		Conta cc = new ContaCorrente(paulo);
		Conta poupanca = new ContaCorrente(paulo);

		cc.depositar(100);
		cc.transferir(75, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
