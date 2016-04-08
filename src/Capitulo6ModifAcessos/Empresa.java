
package Capitulo6ModifAcessos;

public class Empresa {

	// toda empresa criada, cria um array com x funcionarios
	Funcionario[] empregados;

	private String cnpj;

	public String getCNPJ() {
		return this.cnpj;
	}

	public Empresa(int x) {
		Funcionario[] empregados2 = new Funcionario[x];
		this.empregados = empregados2;
	}

	void adiciona(Funcionario f) {
		int i;
		for (i = 0; i < empregados.length; i++) {
			if (empregados[i] == null) {
				this.empregados[i] = f;
				System.out.println("O funcionario " + empregados[i].getNome() + " foi adicionado!");
				break;
			}
		}
		if (i == empregados.length) {
			int tam = empregados.length;
			System.out.println("O funcionario não foi adicionado, não há vagas!");
			// criado entï¿½o um novo array com tamanho maior
			Funcionario[] empregados1 = new Funcionario[tam + 1];
			for (int k = 0; k < tam; k++) {
				empregados1[k] = empregados[k];
			}
			int x;
			for (x = tam; x < empregados1.length; x++) {
				if (empregados1[x] == null) {
					empregados1[x] = f;
				}
			}
			System.out.println("Funcionario " + f.getNome() + " adicionado! Composição de um lugar a mais na lista!");
			// esse comando ï¿½ a chave de tudo, aqui tu determina que o novo
			// array principal ï¿½ o com maior espaï¿½o, descartando o anterior
			this.empregados = empregados1;
		}

	}

	void mostraEmpregados() {
		for (Funcionario f : empregados) {
			f.mostra();
		}
	}

	// verifica se funcionario existe
	boolean contem(Funcionario f) {
		int i;
		for (i = 0; i < empregados.length; i++) {
			if (empregados[i].getRG() == f.getRG()) {
				break;
			}
		}
		if (i == empregados.length) {
			return false;
		}
		return true;
	}

	public Funcionario getFuncionario(int pos) {
		return this.empregados[pos];
	}

}