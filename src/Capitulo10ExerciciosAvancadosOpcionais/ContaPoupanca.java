package Capitulo10ExerciciosAvancadosOpcionais;

public class ContaPoupanca implements Conta {
	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 3;
	}
}
