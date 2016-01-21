package br.edu.ifpi.contaInterface.modelo;

public class ContaPoupanca implements Conta {

	private double saldo;

	public void atualiza(double taxa) {
		this.saldo = this.getSaldo() * taxa * 3;

	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

	// public void atualiza(double taxa) {
	// super.atualiza(taxa*3);;
	// }

}
