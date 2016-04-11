package Capitulo11ExcecoesEErros;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		try {
			c.saca(2000);
			System.out.println("Consegui sacar");
			cc.saca(400);
			System.out.println("Consegui sacar");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
