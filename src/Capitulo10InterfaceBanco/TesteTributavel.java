package Capitulo10InterfaceBanco;

public class TesteTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());

		// testando polimorfismo, só para ver que tem como fazer algo do tipo,
		// inutil aqui
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}
