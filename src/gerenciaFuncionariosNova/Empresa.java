package gerenciaFuncionariosNova;

public class Empresa {
	Funcionario[] empregados = new Funcionario[10]; // toda empresa criada, cria
													// um array com 10
													// funcionarios
	String cnpj;

	void adiciona(Funcionario f) {
		int i;
		for (i = 0; i < empregados.length; i++) {
			if (empregados[i] == null) {
				this.empregados[i] = f;
				System.out.println("O funcionario " + empregados[i].nome + " foi adicionado!");
				break;
			}
		}
		if (i == empregados.length) {
			int tam = empregados.length;
			System.out.println("O funcionario não foi adicionado, não há vagas!");
			// criado então um novo array com tamanho maior
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
			System.out.println("Funcionario " + f.nome + " adicionado! Composição de um lugar a mais na lista!");
			// esse comando é a chave de tudo, aqui tu determina que o novo
			// array principal é o com maior espaço, descartando o anterior
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
			if (empregados[i].rg == f.rg) {
				break;
			}
		}
		if (i == empregados.length) {
			return false;
		}
		return true;
	}
}
