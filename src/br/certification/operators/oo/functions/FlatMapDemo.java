package br.certification.operators.oo.functions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> letters1 = Arrays.asList("a", "b");
		List<String> letters2 = Arrays.asList("b", "c", "d");
		List<String> letters3 = Arrays.asList("e", "f");
		List<List<String>> listOfLetters = Arrays.asList(letters1, letters2, letters3);
		
		System.out.println("listOfLetters" + listOfLetters);

		List<String> flatList = listOfLetters.stream()
		        .flatMap(List::stream)
		        .collect(Collectors.toList());
		System.out.println(flatList);
	}
}
