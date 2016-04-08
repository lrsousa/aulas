package codigoLeonardo;

public class pessoa {
	String nome;
	String sobrenome;

	pessoa(String nome) {
		this.nome = nome;
	}

	String getName() {
		return nome;
	}

	String getLastName() {
		return sobrenome;
	}

	void setLastName(String sobrenome) {
		this.sobrenome = sobrenome;

	}
}
