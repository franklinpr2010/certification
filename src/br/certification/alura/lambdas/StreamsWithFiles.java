package br.certification.alura.lambdas;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsWithFiles {
	public static void main(String[] args) throws IOException {

		// Files do pacote
		Files.list(Paths.get("./src/br/certification/alura/lambdas")).filter(p -> p.toString().endsWith(".java"))
				.forEach(System.out::println);

		// Não compila, pois lines lança um ioException
		Files.list(Paths.get("./src/br/certification/alura/lambdas")).filter(p -> p.toString().endsWith(".java"))
				// .map(p -> Files.lines(p))
				.forEach(System.out::println);

		// Agora compila
		Files.list(Paths.get("./src/br/certification/alura/lambdas")).filter(p -> p.toString().endsWith(".java"))
				.map(p -> lines(p)).forEach(System.out::println);

		// Flat Map
		Grupo englishSpeakers = new Grupo();
		englishSpeakers.add(Data.getData().get(0));
		englishSpeakers.add(Data.getData().get(1));
		
		Grupo spanishSpeakers = new Grupo();
		spanishSpeakers.add(Data.getData().get(2));
		spanishSpeakers.add(Data.getData().get(1));
		
		List<Grupo> groups = Arrays.asList(englishSpeakers, spanishSpeakers);
		//Com duas listas deve usar o flatmap, se fizesse com map iria obter Stream<Stream<Pedido>>
		//com flatMap obtem Stream<Pedido>
		groups.stream()
		.flatMap(g -> g.getUsuarios().stream())
		.distinct()
		.forEach(System.out::println);
		
		//Calculando a quantidade de linhas do arquivo
		LongStream lines =
				Files.list(Paths.get("./src/br/certification/alura/lambdas"))
				.filter(p -> p.toString().endsWith(".java"))
				.mapToLong(p -> lines(p).count());
		
		
		Map<Path, Long> linesPerFile = new HashMap<>();
		
		Files.list(Paths.get("./src/br/certification/alura/lambdas"))
		.filter(p -> p.toString().endsWith(".java"))
		.forEach(p ->
		linesPerFile.put(p, lines(p).count()));
		System.out.println(linesPerFile);
		
		//Com Maps - exibir arquivo e linhas
		
		Map<Path, Long> lines2 =
				Files.list(Paths.get("./src/br/certification/alura/lambdas"))
				.filter(p -> p.toString().endsWith(".java"))
				.collect(Collectors.toMap(
				p -> p,
				p -> lines(p).count()));
		System.out.println(lines);
		
		//groupingBy e partitioningBy
		Usuario user1 = new Usuario("Paulo Silveira", 150.00, true);
		Usuario user2 = new Usuario("Rodrigo Turini", 120.00, true);
		Usuario user3 = new Usuario("Guilherme Silveira", 90.00);
		Usuario user4 = new Usuario("Sergio Lopes", 120.00);
		Usuario user5 = new Usuario("Adriano Almeida", 100.00);
		
		List<Usuario> usuarios =
				Arrays.asList(user1, user2, user3, user4, user5);
		Map<Double, List<Usuario>> pontuacao = new HashMap<>();
		
		for(Usuario u: usuarios) {
			if(!pontuacao.containsKey(u.getPreco())) {
			pontuacao.put(u.getPreco(), new ArrayList<>());
			}
			pontuacao.get(u.getPreco()).add(u);
		}
		
		Map<Double, List<Usuario>> pontuacao2 = new HashMap<>();
		for(Usuario u: usuarios) {
			pontuacao2.computeIfAbsent(u.getPreco(), user -> new ArrayList<>()).add(u);
		}
		
		
		//computeIfAbsent vai substituir o if acima
		Map<Double, List<Usuario>> pontuacao3 = new HashMap<>();
		for(Usuario u: usuarios) {
			pontuacao3
			.computeIfAbsent(u.getPreco(), user -> new ArrayList<>())
			.add(u);
		}
		
		System.out.println(pontuacao3);
		
		Map<Double, List<Usuario>> pontuacao4 = usuarios
				.stream()
				.collect(Collectors.groupingBy(Usuario::getPreco));
		
		System.out.println(pontuacao4);
		
		//Usando partitioningBy para agrupar entre moderadores
		Map<Boolean, List<Usuario>> moderadores = usuarios
				.stream()
				.collect(Collectors.partitioningBy(Usuario::isModerador));

		System.out.println("usuários moderadores: " + moderadores);
		
		
		Map<Boolean, List<String>> nomesPorTipo = usuarios
				.stream()
				.collect(
				Collectors.partitioningBy(
				Usuario::isModerador,
				Collectors.mapping(Usuario::getNome,
				Collectors.toList())));
		System.out.println(nomesPorTipo);
		
		List<Usuario> filtradosOrdenados = usuarios.stream()
				.filter(u -> u.getPreco() > 100)
				.sorted(Comparator.comparing(Usuario::getNome))
				.collect(Collectors.toList());
		
	}

	static Stream<String> lines(Path p) {
		try {
			return Files.lines(p);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}

class Grupo {
	private Set<Usuario> usuarios = new HashSet<>();

	public void add(Usuario u) {
		usuarios.add(u);
	}

	public Set<Usuario> getUsuarios() {
		return Collections.unmodifiableSet(this.usuarios);
	}
}
