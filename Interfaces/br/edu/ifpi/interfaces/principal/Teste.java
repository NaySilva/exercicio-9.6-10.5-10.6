package br.edu.ifpi.interfaces.principal;

import br.edu.ifpi.interfaces.modelos.AreaCalculavel;
import br.edu.ifpi.interfaces.modelos.Retangulo;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		
		a.calculaArea();
		System.out.println(a);

	}

}
