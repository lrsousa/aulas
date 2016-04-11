package Capitulo10ExerciciosAvancadosOpcionais;

public class ContaCorrente implements ContaTributavel {
	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
