package Capitulo14JavaLang;

import java.io.PrintStream;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1 == x2) { // == verifica se eles referenciam o mesmo objeto
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}

		if (x1.equals(x2)) { // equals verifica se eles possuem os mesmos
								// atributos
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}

		// transformar uma string em um numero
		String s = "10";
		int s1 = Integer.parseInt(s);

		// quebrando o metodo System.out.println
		Object saida = System.out;
		((PrintStream) saida).println("ola");

	}
}
