package Capitulo16CollectionsFrameworkJavaUtilCollections;

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
	// ----------CRIANDO HASHCODE E EQUALS-----------------------//
	@Override // CRIAÇÃO DO HASHCODE POR COMPARAÇÃO POR NUMERO
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override // CRIAÇÃO DO EQUALS POR COMPARAÇÃO POR NUMERO
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
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
