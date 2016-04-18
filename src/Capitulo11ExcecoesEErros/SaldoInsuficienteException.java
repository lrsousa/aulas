package Capitulo11ExcecoesEErros;

//classe uncheked
public class SaldoInsuficienteException extends RuntimeException { 
	
	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
