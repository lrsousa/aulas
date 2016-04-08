package desafioCap4;

public class testePessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Olavio";
		p.idade = 20;
		p.fazAniversario();
		System.out.println(p.idade);
		p.fazAniversario();
		System.out.println(p.idade);
	}

}
