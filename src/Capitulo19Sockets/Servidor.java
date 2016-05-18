package Capitulo19Sockets;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(4444);
		System.out.println("Porta 44441 aberta!");

		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());

		Scanner entrada = new Scanner(cliente.getInputStream());
		
		while (entrada.hasNextLine()) {
			try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("saida.txt"))) {
				writer.append(entrada.nextLine());
				writer.append("\n");
			}
//			System.out.println(entrada.nextLine());
		}

		entrada.close();
		servidor.close();
	}
}
