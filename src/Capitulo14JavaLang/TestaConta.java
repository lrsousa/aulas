package Capitulo14JavaLang;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(100.00);
		System.out.println(conta);
		Conta conta1 = new ContaCorrente();
		conta.deposita(100.00);
		System.out.println(conta.equals(conta1));
	}
	
}
