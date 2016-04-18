package Capitulo14JavaLang;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.setNumero(1);
		Conta c2 = new ContaCorrente();
		c2.setNumero(1);

		if (c1 == c2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		if (c1.equals(c2)) {
			System.out.println("Iguais");
		}
	}
}
