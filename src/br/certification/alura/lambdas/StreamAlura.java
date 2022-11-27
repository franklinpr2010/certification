package br.certification.alura.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAlura {
	public static void main(String[] args) {
		
		List<Usuario> maisQue100 = new ArrayList<>();
		
		List<Usuario> users = Data.getData();
		users
		.stream().filter(u -> u.getPreco() > 130.00)
		.forEach(Usuario::tornaModerador);
		
		users.forEach(u  -> System.out.println( u.getNome() + " é moderador? "  + u.isModerador() ));
		
		users.stream().filter(u ->  u.getPreco() > 130.00).forEach(System.out::println);
		
		users.stream()
		.filter(u -> u.getPreco() > 130)
		.forEach(maisQue100::add);
		
		System.out.println(maisQue100.size());
		
		users.stream()
		.filter(u -> u.getPreco() > 100)
		.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		//Transformando para List
		users.stream()
		.filter(u -> u.getPreco() > 100)
		.collect(Collectors.toList());
		
		
		Set<Usuario> maisQue1001 = users
				.stream()
				.filter(u -> u.getPreco() > 100)
				.collect(Collectors.toSet());
		
		
		//Utilizando os maps
		 users.stream().filter(u -> u.getPreco() > 130)
				.map(Usuario::getPreco).peek(System.out::println).collect(Collectors.toList());
		
		 
		 double pontuacaoMedia = users.stream()
				 .mapToDouble(Usuario::getPreco)
				 .average()
				 .getAsDouble();
		 
		 System.out.println(pontuacaoMedia);
		 
		 Optional<Usuario> max = users
				 .stream()
				 .max(Comparator.comparingDouble(Usuario::getPreco));
		 
		 System.out.println(max);
		 
		 //FindAny - será usado quando encontrar algum
		 Optional<Usuario> findAny = users.stream()
		 .filter(u -> u.getPreco() > 100)
		 .peek(System.out::println)
		 .findAny();
		 
		 users.stream()
		 .filter(u -> u.getPreco() > 100)
		 .peek(System.out::println);
		 
		 double total = users.stream()
				 .mapToDouble(Usuario::getPreco).peek(System.out::println)
				 .sum();
		 System.out.println("soma: " + total);
		 
		 
		 //Operações com reduce
		 int valorInicial = 0;
		 DoubleBinaryOperator operacao = (a, b) -> a + b;
		 double total2 = users.stream()
		 .mapToDouble(Usuario::getPreco)
		 .reduce(valorInicial, operacao);
		 
		 System.out.println("SUM: " +  total2);
		 
		 double total32 = users.stream()
				 .mapToDouble(Usuario::getPreco)
				 .reduce(0, (a, b) -> a + b);
		 
		 System.out.println("total: " +  total32);
		 
		 //Operações com iterator
		 users.stream().iterator()
		 .forEachRemaining(System.out::println);
		 
		 Stream.of(Data.getData());
		 
		 
		 

		
		
		
	}
}
