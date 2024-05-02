
public interface IConta {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, IConta contaDestino);

	void limite(double valor);

	void imprimirExtrato();

}