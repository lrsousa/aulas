package testandoConhecimentoCap5;

public class Casa {
	String cor;
	int totalDePortas = 0;
	Porta[] portas = new Porta[0];

	void pinta(String corNova) {
		this.cor = corNova;
	}

	void adicionaPorta(Porta p) {
		int i;
		for (i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				this.portas[i] = p;
				this.totalDePortas +=1;
				System.out.println("Porta foi adicionada!");
				break;
			}
		}
		if (i == portas.length) {
			int tam = portas.length;
			// criado então um novo array com tamanho maior
			Porta[] portasnovas = new Porta[tam + 1];
			for (int k = 0; k < tam; k++) {
				portasnovas[k] = portas[k];
			}
			int x;
			for (x = tam; x < portasnovas.length; x++) {
				if (portasnovas[x] == null) {
					portasnovas[x] = p;
					this.totalDePortas +=1;
				}
			}
			this.portas = portasnovas;
		}
	}
	
	int quantasPortasEstaoAbertas(){ 
		int i;
		int total = 0;
		for(i = 0; i < this.portas.length; i ++){
			if(portas[i].aberta == true){
				total = total + 1;
			}
		}
		return total;
	} 
	
	int totalDePortas(){
		return totalDePortas;
	 }
	
	// TESTE
	public static void main(String[] args) {
		Casa minhaCasa = new Casa();
		Porta porta1 = new Porta();
		Porta porta2 = new Porta();
		Porta porta3 = new Porta();
		porta2.abre();
		porta3.abre();
		porta3.fecha();
		porta1.abre();
		minhaCasa.adicionaPorta(porta1);
		minhaCasa.adicionaPorta(porta2);
		minhaCasa.adicionaPorta(porta3);
		System.out.println(minhaCasa.totalDePortas());
		System.out.println(minhaCasa.quantasPortasEstaoAbertas());
		minhaCasa.portas[2].abre();
		System.out.println(minhaCasa.quantasPortasEstaoAbertas());
	}
}
