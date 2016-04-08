package desafioCap4;

public class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();

	void pinta(String cor) {
		this.cor = cor;
	}

	

	int quantasPortasEstaoAberta() {
		int resultado = 0;
		if (porta1.estaAberta() == true) {
			resultado += 1;
		}
		if (porta2.estaAberta() == true) {
			resultado += 1;
		}
		if (porta3.estaAberta() == true) {
			resultado += 1;
		}
		return resultado;
	}
}
