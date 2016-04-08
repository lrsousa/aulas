package Capitulo7HerancaPolimorfismo;

public class AtualizadorDeContas{
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo inicial: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo final: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
