package Capitulo16CollectionsFrameworkJavaUtilCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando......");
		//
		// Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis(); // pega o tempo em que iniciou

		int total = 30000;

		long ti = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long tf = System.currentTimeMillis();
		System.out.println("Tempo de inserção: " + (tf - ti));

		long ti2 = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long tf2 = System.currentTimeMillis();
		System.out.println("Tempo de busca: " + (tf2 - ti2));

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo total gasto: " + tempo); // 544 com ArrayList
															// //21 com HashSet
	}
}
