package codigoLeonardo;

import java.util.ArrayList;
import java.util.List;

public class testando {
	public static void main(String[] args) {
		List<pessoa> lista = new ArrayList<pessoa>();
		lista.add(new pessoa("Leonardo"));
		lista.add(new pessoa("Luciano"));
		lista.add(new pessoa("Lee"));
		lista.forEach(p -> p.setLastName("Rangel"));
		lista.forEach(p -> System.out.println(p.getName() + " " + p.getLastName()));
	}
}
