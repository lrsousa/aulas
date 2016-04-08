package Capitulo7HerancaPolimorfismo;

public class ContaPoupanca extends Conta {
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}
}
