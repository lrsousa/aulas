package Capitulo10InterfaceBanco;

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
}
