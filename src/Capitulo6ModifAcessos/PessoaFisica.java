package Capitulo6ModifAcessos;

public class PessoaFisica {
	private String cpf;

	PessoaFisica(String CPF) {
		valida(CPF);

	}

	private void valida(String cpf) {
		if (cpf.length() == 11 && cpf != null) {
			this.cpf = cpf;
			System.out.println("CPF v�lidado.");
		} else {
			System.out.println("CPF inv�lido ou inexistente!");
		}
	}

	public String getCPF() {
		return this.cpf;
	}

}
