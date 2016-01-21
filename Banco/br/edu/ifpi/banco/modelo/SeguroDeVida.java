package br.edu.ifpi.banco.modelo;

public class SeguroDeVida implements Tributavel {

	private String nomeDoCliente;

	public SeguroDeVida(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	@Override
	public double calculaTributos() {
		return 42;
	}

	@Override
	public String toString() {
		return "Seguro de vida - Tributos R$ " + this.calculaTributos();
	}

}
