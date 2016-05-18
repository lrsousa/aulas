package Capitulo19Sockets;

import java.nio.file.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		BufferedWriter writer =  null;
		ServerSocket servidor = new ServerSocket(4444);
		System.out.println("Porta 4444 aberta!");

		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());

		Scanner entrada = new Scanner(cliente.getInputStream());
		String linha = "";

		try { 
			writer = Files.newBufferedWriter(Paths.get("saida.txt"));
		} catch (IOException e) {
			entrada.close();
			servidor.close();
			throw new RuntimeException(e);
		}
		
	while (entrada.hasNextLine()) {
			linha = entrada.nextLine();
			writer.append(linha + "\n");
	}		
		
		entrada.close();
		servidor.close();
	}
}
