package Capitulo11ExcecoesEErros;

public class Conta {
	protected double saldo; // todas as filhas possuem acesso agora!!!

	public void deposita(double valor) throws ValorInvalidoException{
		if (valor < 0) {
			// throw new IllegalArgumentException("Você tentou depositar um
			// valor negativo");
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente," + "tente um valor menor");
		} else {
			this.saldo -= valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}
