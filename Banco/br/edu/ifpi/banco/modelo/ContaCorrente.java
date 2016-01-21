package br.edu.ifpi.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public void atualiza(double taxa) {
		this.saldo = this.getSaldo() * taxa * 2;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public String toString() {
		return "Conta Corrente - Tributos R$ " + this.calculaTributos();
	}

}
