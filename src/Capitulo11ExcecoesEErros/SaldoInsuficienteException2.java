package Capitulo11ExcecoesEErros;

//classe checked, obriga quem chama usar o try/catch ou throws
public class SaldoInsuficienteException2 extends Exception {

	public SaldoInsuficienteException2(String message) {
		super(message);
	}
}
