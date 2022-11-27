package br.certification.alura.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AndThen {
	public static void main(String ... args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150.00);
		Usuario user2 = new Usuario("Rodrigo Turini", 120.00);
		Usuario user3 = new Usuario("Guilherme Silveira", 190.00);
		
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		Consumer<Usuario> mostraMensagem = u ->
		System.out.println("antes de imprimir os nomes");
		Consumer<Usuario> imprimeNome = u ->
		System.out.println(u.getNome());
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
	}
}
