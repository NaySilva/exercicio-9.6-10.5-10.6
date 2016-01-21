package br.edu.ifpi.contaInterface.principal;


import br.edu.ifpi.contaInterface.modelo.ContaCorrente;
import br.edu.ifpi.contaInterface.modelo.ContaTributavel;

public class TesteContaInterface {
	public static void main(String[] args) {
		ContaTributavel ct = new ContaCorrente();
		
		ct.deposita(100);
		ct.calculaTributos();
		System.out.println(ct);
		
	}

}
