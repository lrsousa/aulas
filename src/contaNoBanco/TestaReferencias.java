package contaNoBanco;

public class TestaReferencias {
	public static void main(String[] args){
		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1; //copia o valor da variavel c1 dentor de c2, logo, copia a referencia ao objeto conta, fazendo ambos apontar pro mesmo objeto!! 
		c2.deposita(200);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		
		Conta c3 = new Conta();
		c3.nome = "Camilo";
		c3.saldo = 227;
		
		Conta c4 = new Conta();
		c4.nome = "Camilo";
		c4.saldo = 227;
		
		/*if(c3 == c4){
			System.out.println("Contas iguais"); isso compara o conteudo das variaveis, ou seja, o endereço em que o objeto delas se encontra
			como são duas contas com new, diferentes, cada conta é um objeto, portanto, são DIFERENTES, mesmo possuindo os mesmos atributos! 
		}*/
	}
}
