package Capitulo19Sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import org.omg.CORBA.portable.UnknownException;

public class ClienteTXT {
	public static void main(String[] args) throws UnknownException, IOException {
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");

		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());

		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}

		saida.close();
		teclado.close();
	}
}
