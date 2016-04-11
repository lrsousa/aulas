package Capitulo11ExcecoesEErros;

public class TestaBanco {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		Banco banrisul = new Banco(4);
		banrisul.adiciona(c);
		banrisul.adiciona(cc);
		banrisul.adiciona(cp);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		// testando algumas coisas
		Conta aux = new Conta();
		for(int i = 0; i < banrisul.pegaTotalDeContas(); i++){
			aux = banrisul.pegaConta(i);
			adc.roda(aux);
			System.out.println("DENTRO DO FOR Saldo da conta é :" + aux.getSaldo()); //aqui atualiza
		}
		System.out.println("FORA DO FOR Saldo da conta é :" + banrisul.pegaConta(0).getSaldo());
	}
	
}
