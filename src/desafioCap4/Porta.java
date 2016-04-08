package desafioCap4;

public class Porta {
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre(){
		aberta = true;
	}
	
	void fecha(){
		aberta = false;
	}
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	boolean estaAberta(){
		if(aberta){
			return true;
		} else {
			return false;
		}
	}
	
}
