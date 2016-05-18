package Capitulo19Sockets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import org.omg.CORBA.portable.UnknownException;

public class ClienteTXT {
	public static void main(String[] args) throws UnknownException, IOException {
		Socket cliente = new Socket("127.0.0.1", 4444);
		System.out.println("O cliente se conectou ao servidor!");

		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		PrintStream saida = new PrintStream(cliente.getOutputStream());

		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}

		saida.close();
		entrada.close();
	}
}
