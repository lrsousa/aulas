package Capitulo6ModifAcessos;

public class Data {
	int dia;
	int mes;
	int ano;
	boolean aceita;

	public void configuraData(int d, int m, int a) {
		if (m == 2 && d <= 29) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
			this.aceita = true;
		} else if (d <= 31 && m <= 12 && (m != 2 && d <= 31)) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
			this.aceita = true;
		} else {
			this.aceita = false;

		}

	}

	String formatada() {
		return dia + "/" + mes + "/" + ano;
	}
}