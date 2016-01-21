package br.edu.ifpi.banco.modelo;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	  
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.print("Saldo Anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println(" - Novo Saldo: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
}
