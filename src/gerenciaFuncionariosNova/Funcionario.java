package gerenciaFuncionariosNova;

public class Funcionario {
	String nome;
	String departamento;
	// String data;
	String rg;
	double salario;
	Data dataDeEntrada;

	void recebeAumento(double aumento) {
		this.salario = this.salario + aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.rg);
		System.out.println("Departamento: " + this.departamento);
		// System.out.println("Data de entrada: " + this.data);
		System.out.println("Salario: " + this.salario);
		System.out.println("Salario Anual: " + this.calculaGanhoAnual());
	}

	void mostraData() {
		System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
	}
}
