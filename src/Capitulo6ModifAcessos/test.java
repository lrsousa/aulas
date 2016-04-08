package Capitulo6ModifAcessos;

public class test {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		// f.nome = "Flavio"; --erouuuuuuuu
		f.setNome("Flavio"); // acertouuu
		f.setSalario(300);

		System.out.println(f.getIDF());
		Funcionario f1 = new Funcionario("Olavio");
		System.out.println(f.getIDF());
		System.out.println(f1.getIDF());
		Funcionario f2 = new Funcionario("Camilo");
		Funcionario f3 = new Funcionario("Torto");
		Empresa google = new Empresa(4);
		google.adiciona(f1);
		google.adiciona(f);
		google.adiciona(f2);
		google.adiciona(f3);
		Data nova = new Data();
		nova.configuraData(31, 12, 2015);
		// google.mostraEmpregados();
		f3.setData(nova);
		f3.mostraData();
		PessoaFisica f5 = new PessoaFisica("86390430000");
		System.out.println(f5.getCPF());
	}

}
