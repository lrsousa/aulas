package Capitulo16CollectionsFrameworkJavaUtilCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestaOrdenacoes {

	public static void main(String[] args) {
		// ordem decrescente em TreeSet
		Collection<Integer> numeros = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < 1000; i++) {
			numeros.add(i + 1);
		}
		numeros.forEach(n -> System.out.println(n));

		// ordem decrescente em Array
		Collection<Integer> numeros1 = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			numeros1.add(i + 1);
		}
		Collections.reverse((List<Integer>) numeros1);
		numeros1.forEach(n -> System.out.println(n));
	}

}
