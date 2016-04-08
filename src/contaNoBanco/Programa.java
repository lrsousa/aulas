//classe criada para usar a classe Conta
package contaNoBanco;

public class Programa {
	public static void main(String[] args){
		Conta minhaConta1;
		minhaConta1 = new Conta();
		
		minhaConta1.nome = "Olavio";
		minhaConta1.saldo = 1000.0;
		
		System.out.println("Saldo atual: " + minhaConta1.saldo);
	}
}
