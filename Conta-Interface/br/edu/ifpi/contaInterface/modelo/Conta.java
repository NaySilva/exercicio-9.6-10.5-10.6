package br.edu.ifpi.contaInterface.modelo;

public interface Conta {
	public double getSaldo();

	public void deposita(double valor);

	public void saca(double valor);

	public void atualiza(double taxa);

}
