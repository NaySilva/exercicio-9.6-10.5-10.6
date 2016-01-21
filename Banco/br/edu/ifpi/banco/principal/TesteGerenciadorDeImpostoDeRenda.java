package br.edu.ifpi.banco.principal;

import br.edu.ifpi.banco.modelo.ContaCorrente;
import br.edu.ifpi.banco.modelo.GerenciadorDeImpostoDeRenda;
import br.edu.ifpi.banco.modelo.SeguroDeVida;

public class TesteGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gir = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida("Joao");
		gir.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		gir.adiciona(cc);

		System.out.println("Total de Tributos R$ " + gir.getTotal());
		System.out.printf("O saldo é: %.2f", cc.getSaldo());

	}

}
