package br.edu.ifpi.interfaces.modelos;

public class Retangulo implements AreaCalculavel {

	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return this.altura * this.largura;
	}

	@Override
	public String toString() {
		return "Retangulo - Area " + this.calculaArea();
	}

}
