package Capitulo7HerancaPolimorfismo;

public class Conta {
	protected double saldo; // todas as filhas possuem acesso agora!!!

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}


	public double getSaldo() {
		return this.saldo;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}
