package br.edu.ifpi.banco.modelo;


public class Banco {
	
	private Conta contas[];
	private int qtd;

	
	public Banco() {
		this.contas = new Conta[10];
	}


	public void adicionaConta(Conta c){
		this.contas[qtd++] = c;
	}
	
	public Conta pegaConta(int x){
		return this.contas[x];
	}
	
	public int pegaTotalDeContas(){
		return qtd;
	}


	public Conta[] getContas() {
		return contas;
	}

	
	
	
}
