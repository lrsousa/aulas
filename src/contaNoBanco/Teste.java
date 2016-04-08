package contaNoBanco;

public class Teste {
	public static void main(String[] args){
		Conta1 minhaConta = new Conta1();
		Cliente c = new Cliente();
		minhaConta.titular = c;
		minhaConta.titular.nome = "Olavio";
		
		
	}
}
