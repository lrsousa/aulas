package Capitulo10InterfaceArea;

public class Circulo implements Areacalculavel {
	private int raio;

	public double calculaArea() {
		return this.raio * this.raio * Math.PI;
	}
}
