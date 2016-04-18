package Capitulo14JavaLang;

public abstract class Conta {
	protected double saldo;

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

	public abstract void atualiza(double taxa);

	// reescrevendo toString
	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}

	// comparando os valores de duas contas
	private int numero;

	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.getNumero() == outraConta.getNumero();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
