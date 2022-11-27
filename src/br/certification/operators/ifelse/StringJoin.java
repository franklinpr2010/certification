package br.certification.operators.ifelse;



public class StringJoin {
	public static void main(String[] args) {
		String input = String.join(",", "a", "b");
		
		if(input.contains("a") && input.contains("b")) {
			System.out.println("its ok");
		}
	}
}
