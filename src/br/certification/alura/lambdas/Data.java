package br.certification.alura.lambdas;

import java.util.List;

public class Data {
	public static List<Usuario> getData() {
		Usuario user1 = new Usuario("Paulo Silveira", 150.00);
		Usuario user2 = new Usuario("Rodrigo Turini", 120.00);
		Usuario user3 = new Usuario("Guilherme Silveira", 190.00);
		return  List.of(user1, user2, user3);
		
	}
}
