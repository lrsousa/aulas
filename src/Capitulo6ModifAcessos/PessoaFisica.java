package Capitulo6ModifAcessos;

public class PessoaFisica {
	private String cpf;

	PessoaFisica(String CPF) {
		valida(CPF);

	}

	private void valida(String cpf) {
		if (cpf.length() == 11 && cpf != null) {
			this.cpf = cpf;
			System.out.println("CPF válidado.");
		} else {
			System.out.println("CPF inválido ou inexistente!");
		}
	}

	public String getCPF() {
		return this.cpf;
	}

}
