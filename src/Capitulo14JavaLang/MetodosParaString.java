package Capitulo14JavaLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MetodosParaString {

	// imprime caracter por caracter
	public void ImprimeStringChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	// copia uma string dentro de outra, mas do lado inverso
	public void ImprimeStringInversa(String str) {
		String aux = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			aux += String.valueOf(str.charAt(i));
		}
		System.out.println(aux);
	}

	// escrevendo as palavras na ORDEM inversa
	public void ImprimeStringOrdemInversa(String str) {
		List<String> lista = Arrays.asList(str.split(" "));
		Collections.reverse(lista);
		lista.forEach(palavra -> System.out.print(palavra + " "));
	}

	// converter String em inteiro
	public void TransformaStringEmInt(String str) {
		int numero = 0;
		int valordaposicao;
		char aux;
		for (int i = 0; i < str.length(); i++) {
			aux = (char) str.charAt(i);
			valordaposicao = Character.getNumericValue(aux);
			numero = numero * 10 + valordaposicao;
		}
		System.out.println("\n" + numero);
	}
}
