package desafioCap4;

public class testaPorta {
	public static void main(String[] args){
	Porta p = new Porta();
	p.cor = "Marrom";
	p.aberta = true;
	p.dimensaoX = 10;
	p.dimensaoY = 5;
	p.dimensaoZ = 3;
	p.fecha();
	p.abre();
	System.out.println(p.cor);
	System.out.println(p.estaAberta());
	p.cor = "Amarelo";
	System.out.println(p.cor);
	
	}

}
