package Capitulo15JavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {
		// teste pelo arquivo
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		System.out.println(linha);
		
		//ou
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
		//String linha = br.readLine();
		//System.out.println(linha);
		//ou
		/*
		 * TESTE PELO TECLADO InputStream is = System.in; InputStreamReader isr
		 * = new InputStreamReader(is); BufferedReader br = new
		 * BufferedReader(isr);
		 * 
		 * System.out.println("Digite sua mensagem:"); String linha =
		 * br.readLine(); // primeira linha
		 * 
		 * while (linha != null) { System.out.println(linha); linha =
		 * br.readLine(); } br.close();
		 */
	}
}
