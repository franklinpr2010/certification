package br.certification.alura.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150.00);
		Usuario user2 = new Usuario("Rodrigo Turini", 120.00);
		Usuario user3 = new Usuario("Guilherme Silveira", 190.00);
		List<Usuario> usuarios = new ArrayList<>();
		Predicate<Usuario> predicado = u -> u.getPreco() > 120;
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.removeIf(predicado);
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}
