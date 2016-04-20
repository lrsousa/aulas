package Capitulo16CollectionsFrameworkJavaUtilList;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {
	public static void main(String[] args) {
		// List<ContaPoupanca> contas = new ArrayList<>();
		List<ContaPoupanca> contas = new LinkedList<>();
		/// ESSES METODOS ABAIXO FAZEM A INSERÇÃO DE NUMEROS ALEATORIOS E A
		/// CRIAÇÃO DE NOVAS CONTAS
		/*
		 * ContaPoupanca c1 = new ContaPoupanca(); c1.setNumero(1973);
		 * contas.add(c1);
		 * 
		 * ContaPoupanca c2 = new ContaPoupanca(); c2.setNumero(1462);
		 * contas.add(c2);
		 * 
		 * ContaPoupanca c3 = new ContaPoupanca(); c3.setNumero(1854);
		 * contas.add(c3);
		 * 
		 * // criando novas contas e numeros(randomicos) e adicionando na Lista
		 * for (int i = 0; i < 10; i++) { Random gerador = new Random();
		 * ContaPoupanca cp = new ContaPoupanca();
		 * cp.setNumero(gerador.nextInt(2000)); contas.add(cp); }
		 * 
		 * Collections.sort(contas); // ordena por ordem dos elementos //
		 * Collections.reverse(contas); //inverte a ordem dos elementos //
		 * Collections.shuffle(contas); //embaralha a ordem dos elementos //
		 * Collections.rotate(contas, 2); //rotaciona o elemento para a posição
		 * // i + distance for (int i = 0; i < contas.size(); i++) {
		 * System.out.println("numero: " + contas.get(i).getNumero()); //mostra
		 * o numero }
		 */
		/// ESSES METODOS ABAIXO FAZEM A INSERÇÃO DE NOMES E A CRIAÇÃO DE NOVAS
		/// CONTAS
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNomeDoCliente("Olavio");
		contas.add(c1);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNomeDoCliente("Julia");
		contas.add(c2);
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNomeDoCliente("Toshi");
		contas.add(c3);
		Collections.sort(contas); // compareTo foi mudado, agr ordena por nome
		for (int i = 0; i < contas.size(); i++) {
			System.out.println("nome: " + contas.get(i).getNomeDoCliente());
		}
	}
}
