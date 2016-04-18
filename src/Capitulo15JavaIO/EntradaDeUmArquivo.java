package Capitulo15JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
//leitura de um arquivo na tela
public class EntradaDeUmArquivo {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		
		System.out.println("Digite sua mensagem:");
		while(entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		entrada.close();
	}
}
