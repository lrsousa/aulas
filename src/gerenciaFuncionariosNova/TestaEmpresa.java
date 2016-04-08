package gerenciaFuncionariosNova;

public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa digimer = new Empresa();
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		f1.nome = "toshi";
		f1.salario = 300;
		f2.nome = "olavio";
		f2.salario = 300;
		f2.rg = "32";
		digimer.adiciona(f1);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f2);
		digimer.adiciona(f1);
		digimer.adiciona(f2);
		// digimer.mostraEmpregados();
		// System.out.println(digimer.contem(f2));
		digimer.mostraEmpregados();
	}
}
