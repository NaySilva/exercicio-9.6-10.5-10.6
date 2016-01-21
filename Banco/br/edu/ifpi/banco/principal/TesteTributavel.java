package br.edu.ifpi.banco.principal;

import br.edu.ifpi.banco.modelo.ContaCorrente;
import br.edu.ifpi.banco.modelo.Tributavel;

public class TesteTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());

		Tributavel t = cc;
		System.out.println(t.calculaTributos());

	}

}
