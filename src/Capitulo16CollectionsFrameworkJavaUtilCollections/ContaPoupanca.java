package Capitulo16CollectionsFrameworkJavaUtilCollections;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	/*
	 * @Override //ESSE COMPARA PELO NUMERO public int compareTo(ContaPoupanca
	 * outra) { if (this.getNumero() < outra.getNumero()) { // compara a conta
	 * nova com // a atual return -1; } if (this.getNumero() >
	 * outra.getNumero()) { return 1; } return 0; }
	 */

	/*
	 * ou public int compareTo(ContaPoupanca outra){ return
	 * Integer.compare(this.getNumero(), outra.getNumero()); }
	 */

	@Override // ESSE COMPARA PELO NOME// usa compareTo da string(recursivo)
	public int compareTo(ContaPoupanca outra) {
		int compare = this.getNomeDoCliente().compareTo(outra.getNomeDoCliente());
		if (compare < 1) {
			return -1;
		}
		if (compare > 1) {
			return 1;
		}
		return 0;
	}

}