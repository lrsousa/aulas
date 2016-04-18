package Capitulo14JavaLang;

public class TestaGuardadorDeObjetos {
	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		Conta conta = new ContaCorrente();
		conta.deposita(1000);
		guardador.adicionaObjeto(conta);
		ContaCorrente cc = (ContaCorrente) guardador.pegaObjeto(0); // casting
																	// pra
																	// compilar
		System.out.println(guardador.pegaObjeto(0));

		// passando um inteiro para um objeto
		int x = 5;
		Integer i = new Integer(x);
		guardador.adicionaObjeto(x);
	}
}
