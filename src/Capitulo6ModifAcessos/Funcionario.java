package Capitulo6ModifAcessos;

public class Funcionario {
	private String nome;
	private String departamento;
	private Data data;
	private String rg;
	private double salario;
	private int idFunc;
	private static int identificador;

	// aqui construtor
	Funcionario() {
		Funcionario.identificador += 1;
		setIDF(getId());
	}

	Funcionario(String nome) {
		Funcionario.identificador += 1;
		this.nome = nome;
		setIDF(getId());
	}

	// criando getters and setters
	public int getIDF() {
		return this.idFunc;
	}

	public void setIDF(int v) {
		this.idFunc += v;
	}

	public int getId() {
		return Funcionario.identificador;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return this.rg;
	}

	public void setRG(String rg) {
		this.rg = rg;
	}

	public String getDep() {
		return this.departamento;
	}

	public void setDep(String dep) {
		this.departamento = dep;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void recebeAumento(double aumento) {
		this.setSalario(aumento);
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public void mostra() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRG());
		System.out.println("Departamento: " + this.getDep());
		if (data.aceita) {
			System.out.println("Data de entrada: " + this.getData().formatada());
		}
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Salario Anual: " + this.calculaGanhoAnual());
	}

	public void mostraData() {
		if (data.aceita == true) {
			System.out.println("Data de entrada: " + this.getData().formatada());
		} else {
			System.out.println("Data inválida");
		}
	}

}
