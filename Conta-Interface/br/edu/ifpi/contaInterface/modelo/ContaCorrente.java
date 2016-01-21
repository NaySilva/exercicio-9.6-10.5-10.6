package br.edu.ifpi.contaInterface.modelo;

public class ContaCorrente implements ContaTributavel {

	private double saldo;

	public void atualiza(double taxa) {
		this.saldo = this.getSaldo() * taxa * 2;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta Corrente - Saldo " + this.saldo + " - Tributos " + this.calculaTributos();
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;

	}

	@Override
	public double calculaTributos() {
		return this.saldo * 0.01;
	}

}
