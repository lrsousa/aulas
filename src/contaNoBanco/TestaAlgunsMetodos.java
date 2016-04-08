package contaNoBanco;

class TestaAlgunsMetodos {
	public static void main(String[] args){
	//criando conta
	Conta minhaConta;
	minhaConta = new Conta();
	
	//alterando valores de minhaConta
	minhaConta.nome = "Camilo";
	minhaConta.saldo = 1000;
	
	//aqui testamos o saque
		boolean consegui = minhaConta.saca(2000);
		if(consegui){
			System.out.println("Consegui sacar");
		}else {
			System.out.println("Não consegui sacar");
		}
		//ou ignorar a variavel 'consegui' ficando assim:
		/*
		 if(minhaConta.saca(2000){
		 	System.out.println("Consegui sacar");
		 } else {
		 	System.out.println("Nao consegui sacar");
		 	}
		 */
	
	//deposita 500 reais
	minhaConta.deposita(500);
	System.out.println(minhaConta.saldo);
	}
}
