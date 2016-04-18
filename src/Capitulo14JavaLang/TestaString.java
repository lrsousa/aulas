package Capitulo14JavaLang;

public class TestaString {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append("fj11");
		s.replace(0, 4, "fj22");
		System.out.println(s);

		// saber se String está dentro da outra
		String str1 = "casa";
		String str2 = "asa";
		if (str1.contains(str2)) {
			System.out.println(str1 + " contém a palavra " + str2);
		}

		// tirar os epaços da ponta de ma String
		String str3 = " casa ";
		str3 = str3.replaceAll(" ", "");
		System.out.println(str3);

		// saber se a String está vazia
		String str4 = "casa";
		System.out.println(str4.isEmpty());

		// saber quantos caracteres tem a String
		String str5 = "casa";
		System.out.println(str5.length());

		MetodosParaString teste = new MetodosParaString();
		String nova = "Anotaram a data da maratona";
		//escrevendoCaracterporcaracter
		teste.ImprimeStringChar(nova);
		//escrevendoInvertida
		teste.ImprimeStringInversa(nova);
		//reescrevendo na ordem invertida
		teste.ImprimeStringOrdemInversa(nova);
	}
}
