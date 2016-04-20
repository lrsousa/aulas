package Capitulo16CollectionsFrameworkJavaUtilCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	protected List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> mapaDeNomes = new HashMap<>();

	public void adiciona(Conta c) {
		this.contas.add(c);
		this.mapaDeNomes.put(c.getNomeDoCliente(), c);
	}

	public Conta pega(int x) {
		return this.contas.get(x);
	}

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}

	public Conta buscaPorNome(String nome) {
		return this.mapaDeNomes.get(nome);
	}

}
