package Capitulo15JavaIO;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EditorDeArquivos {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		OutputStream os = new FileOutputStream("editado.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		Scanner entrada = new Scanner(is);
		String texto = entrada.nextLine();
		System.out.println(texto);
		bw.write(texto);
		bw.newLine();
		is.close();
		bw.close();
		os.close();
		osw.close();
	}
}
