package desafioCap4;

public class testaCasa {

	public static void main(String[] args) {
		Casa c = new Casa();

		c.pinta("Amarela");
		c.porta1.abre();
		c.porta1.cor = "Azul";

		System.out.println(c.quantasPortasEstaoAberta());
		c.porta2.abre();
		System.out.println(c.quantasPortasEstaoAberta());
		c.porta3.abre();
		System.out.println(c.quantasPortasEstaoAberta());
		c.porta1.fecha();
		System.out.println(c.quantasPortasEstaoAberta());

	}

}
