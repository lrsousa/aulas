package testandoConhecimentoCap5;

public class Porta {
	boolean aberta = false;
	
	void abre(){
		this.aberta = true;
	}
	
	void fecha(){
		this.aberta = false;
	}
	
	boolean estaAberta(){
		if(aberta == true){
			return true;
		} else {
			return false;
		}
	}
}
