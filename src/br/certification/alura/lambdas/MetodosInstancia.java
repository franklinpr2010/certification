package br.certification.alura.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MetodosInstancia {
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150.00);
		Usuario user2 = new Usuario("Rodrigo Turini", 120.00);
		Usuario user3 = new Usuario("Guilherme Silveira", 190.00);
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		Usuario rodrigo = new Usuario("Rodrigo Turini", 50.00);
		Runnable bloco = rodrigo::tornaModerador;
		bloco.run();
		
		System.out.println(rodrigo.isModerador());
		

		List<Usuario> usuarios2 = Arrays.asList(user1, user2, user3);
		usuarios2.forEach(System.out::println);
		
		//Criação com construtor default usa Supplier
		Supplier<Usuario> criadorDeUsuarios = Usuario::new;
		Usuario novo = criadorDeUsuarios.get();
		
		//Com construtor com parametro
		Function<String, Usuario> criadorDeUsuarios2 = Usuario::new;
		Usuario ro = criadorDeUsuarios2.apply("RoVaiTaLá");
		Usuario pa = criadorDeUsuarios2.apply("Paulo");
		
		List<Usuario> of = List.of(ro, pa);
		
		of.forEach(u -> System.out.println(u.getNome()));
		
		//Mais que um parametro no constutor usando BiFunction
		BiFunction<String, Double, Usuario> criadorDeUsuarios3 =
				Usuario::new;
		
		Usuario ro2 = criadorDeUsuarios3.apply("RoVaiTaLá", 120.00);
		Usuario pa2 = criadorDeUsuarios3.apply("Paulo", 130.00);
		
		
		
		
		
	}
}
