package br.certification.alura.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class Sort {
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150.00);
		Usuario user2 = new Usuario("Rodrigo Turini", 120.00);
		Usuario user3 = new Usuario("Guilherme Silveira", 190.00);
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		usuarios.stream().peek(System.out::println);
		
		Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
		nameStream.peek(System.out::println);
		
		
		Comparator<Usuario> comparator =
				Comparator.comparing(u -> u.getNome());
		
		usuarios.sort(comparator);
		
		usuarios.forEach(u -> {  System.out.println(u.getNome());  });
		
		
		List<String> palavras =
				Arrays.asList("Casa do Código", "Alura", "Caelum");
				Collections.sort(palavras);
				
		//Usando o ToDoubleFunction	
		ToDoubleFunction<Usuario> extraiPontos = u -> u.getPreco();
		Comparator<Usuario> comparator2 =
		Comparator.comparingDouble(extraiPontos);
		usuarios.sort(comparator2);
		usuarios.forEach(u -> {  System.out.println(u.getNome() + "-" +  u.getPreco());   });
				
		

		
		
	}
}
