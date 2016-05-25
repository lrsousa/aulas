package Capitulo19Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Servidor {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(4444);
		System.out.println("Porta 4444 aberta!");

		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
		
		InputStream ip = cliente.getInputStream();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(ip));
		Files.write(Paths.get("saida.txt"), (Iterable<String>)buffer.lines()::iterator);
	}
}
