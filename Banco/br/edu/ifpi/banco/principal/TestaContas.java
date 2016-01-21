package br.edu.ifpi.banco.principal;

import br.edu.ifpi.banco.modelo.*;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1200);
		cp.deposita(1500);
		
//		System.out.println(c.getSaldo());
//		System.out.println(cc.getSaldo());
//		System.out.println(cp.getSaldo());
		Banco banco = new Banco();
		banco.adicionaConta(c);
		banco.adicionaConta(cc);
		banco.adicionaConta(cp);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
		
		for (int i = 0; i < banco.pegaTotalDeContas(); i++ ){
			adc.roda(banco.getContas()[i]);
		}
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
		

	}

}
