package Capitulo16CollectionsFrameworkJavaUtilList;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	private String nomeDoCliente;

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

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
}
