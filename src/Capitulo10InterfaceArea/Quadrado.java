package Capitulo10InterfaceArea;

public class Quadrado implements Areacalculavel {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	public double calculaArea() {
		return this.lado * this.lado;
	}
}
