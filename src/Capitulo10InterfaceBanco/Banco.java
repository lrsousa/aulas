package Capitulo10InterfaceBanco;

public class Banco extends Conta {
	Conta[] contas;
	private static int totalDeContas = 0;

	public Banco(int x) {
		Conta[] contas2 = new Conta[x];
		this.contas = contas2;
	}

	public void adiciona(Conta c) {
		int i;
		for (i = 0; i < contas.length; i++) {
			if (contas[i] == null) {
				this.contas[i] = c;
				System.out.println("Conta adicionada!");
				Banco.totalDeContas += 1;
				break;
			}
		}
		if (i == contas.length) {
			int tam = contas.length;
			// criado então um novo array com tamanho maior
			Conta[] aux = new Conta[tam + 1];
			for (int k = 0; k < tam; k++) {
				aux[k] = contas[k];
			}
			int x;
			for (x = tam; x < aux.length; x++) {
				if (aux[x] == null) {
					aux[x] = c;
				}
			}
			this.contas = aux;
			// esse comando é a chave de tudo, aqui tu determina que o novo
			// array principal é o com maior espaço, descartando o anterior
			System.out.println("Conta adicionada");
			Banco.totalDeContas += 1;
		}

	}

	public Conta pegaConta(int x) {
		return contas[x];
	}

	public int pegaTotalDeContas() {
		return Banco.totalDeContas;
	}

	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}
}
